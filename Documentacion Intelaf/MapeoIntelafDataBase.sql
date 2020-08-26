CREATE SCHEMA IF NOT EXISTS INTELAF;

USE INTELAF;

CREATE TABLE IF NOT EXISTS CLIENTE(
	Nombre VARCHAR(45) NOT NULL,
	NIT VARCHAR(15) NOT NULL,
	Telefono VARCHAR(10) NOT NULL,
	Credito_Compra DOUBLE NOT NULL,
	DPI VARCHAR(20) NULL,
	Correo_Electronico VARCHAR(45) NULL,
	Direccion VARCHAR(45) NULL,	
	CONSTRAINT PK_CLIENTE PRIMARY KEY(NIT)
);

CREATE TABLE IF NOT EXISTS TIENDA(
	Nombre VARCHAR(45) NOT NULL,
	Direccion VARCHAR(45) NOT NULL,
	Codigo_Tienda VARCHAR(10) NOT NULL,
	Telefono_1 VARCHAR(10) NOT NULL,
	Telefono_2 VARCHAR(10) NULL,
	Horario VARCHAR(45) NULL,
	Correo_Electronico VARCHAR(45) NULL,
	CONSTRAINT PK_TIENDA PRIMARY KEY(Codigo_Tienda)
);

CREATE TABLE IF NOT EXISTS EMPLEADO(
	Nombre VARCHAR(45) NOT NULL,
	Codigo_Empleado VARCHAR(10) NOT NULL,
	Telefono VARCHAR(10) NOT NULL,
	DPI VARCHAR(20) NOT NULL,
	NIT VARCHAR(15) NULL,
	Correo_Electronico VARCHAR (45) NULL,
	Direccion VARCHAR(45) NULL,
	CONSTRAINT PK_EMPLEADO PRIMARY KEY(Codigo_Empleado)
);

CREATE TABLE IF NOT EXISTS TIEMPO(
	Id_Tiempo INT NOT NULL AUTO_INCREMENT,
	Tienda_Origen VARCHAR(10) NOT NULL,
	Tienda_Destino VARCHAR(10) NOT NULL,
	Tiempo INT NOT NULL,
	CONSTRAINT PK_TIEMPO PRIMARY KEY(Id_Tiempo),
	CONSTRAINT FK_TIENDA_ORIGEN FOREIGN KEY(Tienda_Origen) REFERENCES TIENDA(Codigo_Tienda),
	CONSTRAINT FK_TIENDA_DESTINO FOREIGN KEY(Tienda_Destino) REFERENCES TIENDA(Codigo_Tienda)
);

CREATE TABLE IF NOT EXISTS PEDIDO(
	Codigo_Pedido INT NOT NULL AUTO_INCREMENT,
	Fecha DATE NOT NULL,
	Fecha_Llegada DATE NULL,
	NIT_Cliente VARCHAR(15) NOT NULL,
	Anticipo_Efectivo DOUBLE NULL,
	Anticipo_Credito DOUBLE NULL,
	Anticipo DOUBLE NOT NULL,
	Total DOUBLE NOT NULL,
	Total_A_Pagar DOUBLE NULL,
	Pago_Total DOUBLE NULL,
	Caja DOUBLE NULL,
	Estado VARCHAR(15) NULL,
	CONSTRAINT PK_PEDIDO PRIMARY KEY(Codigo_Pedido),
	CONSTRAINT FK_CLIENTE_PEDIDO FOREIGN KEY(NIT_Cliente) REFERENCES CLIENTE(NIT)
);

CREATE TABLE IF NOT EXISTS VENTAS(
	Id_Ventas INT NOT NULL AUTO_INCREMENT,
	Fecha DATE NULL,
	NIT_Cliente VARCHAR(15) NOT NULL,
	Total_A_Pagar DOUBLE NULL,
	Efectivo DOUBLE NULL,
	Credito_Cliente DOUBLE NULL,
	Caja DOUBLE NULL,
	CONSTRAINT PK_VENTAS PRIMARY KEY(Id_Ventas),
	CONSTRAINT FK_CLIENTE_VENTAS FOREIGN KEY(NIT_Cliente) REFERENCES CLIENTE(NIT)
);

CREATE TABLE IF NOT EXISTS EXISTENCIA_PRODUCTO(
	Nombre VARCHAR(45) NOT NULL,
	Fabricante VARCHAR(45) NOT NULL,
	Codigo_Producto VARCHAR(10) NOT NULL,
	Existencia INT NOT NULL,
	Precio DOUBLE NOT NULL,
	Codigo_Tienda VARCHAR(10) NOT NULL,
	Descripcion VARCHAR(200) NULL,
	Garantia INT NULL,
	CONSTRAINT PK_EXISTENCIA_PRODUCTO PRIMARY KEY(Codigo_Producto,Codigo_Tienda),
	CONSTRAINT FK_TIENDA_EXISTENCIA FOREIGN KEY(Codigo_Tienda) REFERENCES TIENDA(Codigo_Tienda)
);

CREATE TABLE IF NOT EXISTS DETALLE_PEDIDO(
	Id_DetallePedido INT NOT NULL AUTO_INCREMENT,
	Codigo_Pedido INT NOT NULL,
	Tienda_Origen VARCHAR(10) NOT NULL,
	Tienda_Destino VARCHAR(10) NOT NULL,
	Codigo_Producto VARCHAR(10) NOT NULL,
	Cantidad INT NULL,
	Precio DOUBLE NULL,
	SubTotal DOUBLE NULL,
	Tiempo_Tiendas INT NULL,
	CONSTRAINT PK_DETALLE_PEDIDO PRIMARY KEY(Id_DetallePedido),
	CONSTRAINT FK_PEDIDO_DETALLE_PEDIDO FOREIGN KEY(Codigo_Pedido) REFERENCES PEDIDO(Codigo_Pedido),
	CONSTRAINT FK1_EXISTENCIA_PRODUCTO_DETALLE_PEDIDO FOREIGN KEY(Codigo_Producto) REFERENCES EXISTENCIA_PRODUCTO(Codigo_Producto),
	CONSTRAINT FK2_EXISTENCIA_PRODUCTO_DETALLE_PEDIDO FOREIGN KEY(Tienda_Origen) REFERENCES EXISTENCIA_PRODUCTO(Codigo_Tienda)
);

CREATE TABLE if NOT EXISTS DETALLE_VENTAS(
	Id_DetalleVentas INT NOT NULL AUTO_INCREMENT,
	Id_Ventas INT NOT NULL,
	Tienda_Existencia VARCHAR(10) NOT NULL,
	Codigo_Producto VARCHAR(10) NOT NULL,
	Cantidad_Venta INT NULL,
	Precio DOUBLE NULL,
	SubTotal DOUBLE NULL,
	CONSTRAINT PK_DETALLE_VENTAS PRIMARY KEY(Id_DetalleVentas),
	CONSTRAINT FK_VENTAS_DETALLE_VENTAS FOREIGN KEY(Id_Ventas) REFERENCES VENTAS(Id_Ventas),
	CONSTRAINT FK1_EXISTENCIA_PRODUCTO_DETALLE_VENTAS FOREIGN KEY(Codigo_Producto) REFERENCES EXISTENCIA_PRODUCTO(Codigo_Producto),
	CONSTRAINT FK2_EXISTENCIA_PRODUCTO_DETALLE_VENTAS FOREIGN KEY(Tienda_Existencia) REFERENCES EXISTENCIA_PRODUCTO(Codigo_Tienda)
);