package org.example;

import org.example.clases.*;
import org.example.enums.Estado;
import org.example.enums.FormaPago;
import org.example.enums.TipoEnvio;
import org.example.librerias.InMemoryRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        InMemoryRepository<Cliente> clientesRepository = new InMemoryRepository<>();
        InMemoryRepository<UnidadMedida> unidadMedidaRepository = new InMemoryRepository<>();
        InMemoryRepository<Imagenes> imagenesRepository = new InMemoryRepository<>();
        InMemoryRepository<Articulo> articuloRepository = new InMemoryRepository<>();
        InMemoryRepository<Pedido> pedidoRepository = new InMemoryRepository<>();

        //Clientes

        Cliente c1 = Cliente.builder()
                .email("pepito@gmail.com")
                .apellido("Juarez")
                .nombre("Pepito")
                .fechaNacimiento(LocalDate.of(1995, 9, 5))
                .telefono("25614895")
                .build();

        Cliente c2 = Cliente.builder()
                .email("maria.lopez@gmail.com")
                .apellido("Lopez")
                .nombre("Maria")
                .fechaNacimiento(LocalDate.of(1988, 3, 12))
                .telefono("35874126")
                .build();

        Cliente c3 = Cliente.builder()
                .email("carlos.perez@hotmail.com")
                .apellido("Perez")
                .nombre("Carlos")
                .fechaNacimiento(LocalDate.of(2000, 11, 22))
                .telefono("41235698")
                .build();

        clientesRepository.save(c1);
        clientesRepository.save(c2);
        clientesRepository.save(c3);

        //Clientes

        //UnidadesDeMedidas

        UnidadMedida u1 = UnidadMedida.builder()
                .denominacion("8 Pociones")
                .build();

        UnidadMedida u2 = UnidadMedida.builder()
                .denominacion("4 Porciones")
                .build();

        UnidadMedida u3 = UnidadMedida.builder()
                .denominacion("1 Litro")
                .build();

        unidadMedidaRepository.save(u1);
        unidadMedidaRepository.save(u2);
        unidadMedidaRepository.save(u3);

        //UnidadesDeMedidas

        //Imagenes

        Imagenes i1 = Imagenes.builder()
                .nombre("Pizza Grande Hawaina")
                .url("https://www.hola.com/horizon/landscape/a17cd68660e0-pizza-hawaiana-t.jpg?im=Resize=(960),type=downsize")
                .build();

        Imagenes i2 = Imagenes.builder()
                .nombre("Pizza Grande Napolitana")
                .url("https://www.example.com/pizza-napolitana-grande.jpg")
                .build();

        Imagenes i3 = Imagenes.builder()
                .nombre("Pizza Grande Muzza")
                .url("https://www.example.com/pizza-muzza-grande.jpg")
                .build();

        Imagenes i4 = Imagenes.builder()
                .nombre("Pizza Chica Hawaiana")
                .url("https://www.example.com/pizza-hawaiana-chica.jpg")
                .build();

        Imagenes i5 = Imagenes.builder()
                .nombre("Pizza Chica Napolitana")
                .url("https://www.example.com/pizza-napolitana-chica.jpg")
                .build();

        Imagenes i6 = Imagenes.builder()
                .nombre("Pizza Chica Muzza")
                .url("https://www.example.com/pizza-muzza-chica.jpg")
                .build();

        Imagenes i7 = Imagenes.builder()
                .nombre("Cerveza Andes")
                .url("https://www.example.com/cerveza-andes.jpg")
                .build();

        Imagenes i8 = Imagenes.builder()
                .nombre("Cerveza Quilmes")
                .url("https://www.example.com/cerveza-quilmes.jpg")
                .build();

        imagenesRepository.save(i1);
        imagenesRepository.save(i2);
        imagenesRepository.save(i3);
        imagenesRepository.save(i4);
        imagenesRepository.save(i5);
        imagenesRepository.save(i6);
        imagenesRepository.save(i7);
        imagenesRepository.save(i8);

        //Imagenes

        //Articulos

        Articulo a1 = Articulo.builder()
                .imagen(i1)
                .precioVenta(125.5)
                .precioCompra(100.0)
                .stockMaximo(60)
                .stockActual(30)
                .tiempoEstimadoMinutos(12)
                .unidadMedida(u1)
                .denominacion("Pizza Grande Hawaina")
                .build();

        Articulo a2 = Articulo.builder()
                .imagen(i2)
                .precioVenta(130.0)
                .precioCompra(105.0)
                .stockMaximo(50)
                .stockActual(25)
                .tiempoEstimadoMinutos(12)
                .unidadMedida(u1)
                .denominacion("Pizza Grande Napolitana")
                .build();

        Articulo a3 = Articulo.builder()
                .imagen(i3)
                .precioVenta(120.0)
                .precioCompra(95.0)
                .stockMaximo(70)
                .stockActual(40)
                .tiempoEstimadoMinutos(12)
                .unidadMedida(u1)
                .denominacion("Pizza Grande Muzza")
                .build();

        Articulo a4 = Articulo.builder()
                .imagen(i4)
                .precioVenta(85.0)
                .precioCompra(70.0)
                .stockMaximo(40)
                .stockActual(20)
                .tiempoEstimadoMinutos(8)
                .unidadMedida(u2)
                .denominacion("Pizza Chica Hawaiana")
                .build();

        Articulo a5 = Articulo.builder()
                .imagen(i5)
                .precioVenta(90.0)
                .precioCompra(75.0)
                .stockMaximo(50)
                .stockActual(30)
                .tiempoEstimadoMinutos(8)
                .unidadMedida(u2)
                .denominacion("Pizza Chica Napolitana")
                .build();

        Articulo a6 = Articulo.builder()
                .imagen(i6)
                .precioVenta(80.0)
                .precioCompra(65.0)
                .stockMaximo(60)
                .stockActual(35)
                .tiempoEstimadoMinutos(8)
                .unidadMedida(u2)
                .denominacion("Pizza Chica Muzza")
                .build();

        Articulo a7 = Articulo.builder()
                .imagen(i7)
                .precioVenta(50.0)
                .precioCompra(35.0)
                .stockMaximo(100)
                .stockActual(50)
                .tiempoEstimadoMinutos(2)
                .unidadMedida(u3)
                .denominacion("Cerveza Andes")
                .build();

        Articulo a8 = Articulo.builder()
                .id(8L)
                .imagen(i8)
                .precioVenta(45.0)
                .precioCompra(30.0)
                .stockMaximo(90)
                .stockActual(40)
                .tiempoEstimadoMinutos(2)
                .unidadMedida(u3)
                .denominacion("Cerveza Quilmes")
                .build();

        articuloRepository.save(a1);
        articuloRepository.save(a2);
        articuloRepository.save(a3);
        articuloRepository.save(a4);
        articuloRepository.save(a5);
        articuloRepository.save(a6);
        articuloRepository.save(a7);
        articuloRepository.save(a8);

        //Articulos

        System.out.println("-----------------------------------------");

        //Ejecucion

        //El cliente1, realiza un pedido de una Pizza grande y una cerveza Quilmes.


        DetallePedido detalleClienteUno1 = DetallePedido.builder()

                .id(1L)
                .articulo(a3)
                .cantidad(1)
                .build();

        detalleClienteUno1.calcularSubTotal();

        DetallePedido detalleClienteUno2 = DetallePedido.builder()

                .id(1L)
                .articulo(a8)
                .cantidad(1)
                .build();

        detalleClienteUno2.calcularSubTotal();

        Pedido pedidoCliente1 = Pedido.builder()

                .cliente(c1)
                .FechaPedido(LocalDate.now())
                .horaEstimadaFinalizacion(LocalTime.now().plusMinutes(20))
                .estado(Estado.PROCESANDO)
                .tipoEnvio(TipoEnvio.DOMICILIO)
                .formaPago(FormaPago.EFECTIVO)
                .detalles(new HashSet<>(Set.of(detalleClienteUno1, detalleClienteUno2)))
                .build();

        Double total = pedidoCliente1.getDetalles().stream().mapToDouble(DetallePedido::getSubTotal).sum();
        pedidoCliente1.setTotal(total);

        pedidoRepository.save(pedidoCliente1);

        System.out.println("Pedido del cliente "+ c1.getNombre() +" : ");
        pedidoCliente1.getDetalles().forEach(detalle -> {
            System.out.println("Artículo: " + detalle.getArticulo().getDenominacion() + ", Cantidad: " + detalle.getCantidad() + ", Subtotal: " + detalle.getSubTotal());
        });
        System.out.println("Total a pagar: " + pedidoCliente1.getTotal());

        //El cliente2, realiza un pedido de una Pizza grande y una cerveza Quilmes.
        System.out.println("-----------------------------------------");

        DetallePedido detalleClienteDos1 = DetallePedido.builder()

                .id(2L)
                .articulo(a8)
                .cantidad(3)
                .build();

        detalleClienteDos1.calcularSubTotal();

        DetallePedido detalleClienteDos2 = DetallePedido.builder()

                .articulo(a4)
                .cantidad(1)
                .build();

        detalleClienteDos2.calcularSubTotal();

        Pedido pedidoCliente2 = Pedido.builder()

                .cliente(c2)
                .FechaPedido(LocalDate.now())
                .horaEstimadaFinalizacion(LocalTime.now().plusMinutes(40))
                .estado(Estado.ENVIADO)
                .tipoEnvio(TipoEnvio.DOMICILIO)
                .formaPago(FormaPago.TARJETA)
                .detalles(new HashSet<>(Set.of(detalleClienteDos1, detalleClienteDos2)))
                .build();

        Double total2 = pedidoCliente2.getDetalles().stream().mapToDouble(DetallePedido::getSubTotal).sum();
        pedidoCliente2.setTotal(total2);

        pedidoRepository.save(pedidoCliente2);

        System.out.println("Pedido del cliente "+ c2.getNombre() +" : ");
        pedidoCliente2.getDetalles().forEach(detalle -> {
            System.out.println("Artículo: " + detalle.getArticulo().getDenominacion() + ", Cantidad: " + detalle.getCantidad() + ", Subtotal: " + detalle.getSubTotal());
        });
        System.out.println("Total a pagar: " + pedidoCliente2.getTotal());

        // El cliente3 compra 1 Pizza grande Hawaiana , 1 pizza chica Muzza , 1 grande Napolitana y 2 cervezas Andes.
        System.out.println("-----------------------------------------");

        DetallePedido detalleClienteTres1 = DetallePedido.builder()

                .id(3L)
                .articulo(a1)
                .cantidad(3)
                .build();

        detalleClienteTres1.calcularSubTotal();

        DetallePedido detalleClienteTres2 = DetallePedido.builder()

                .id(3L)
                .articulo(a6)
                .cantidad(1)
                .build();

        detalleClienteTres2.calcularSubTotal();

        DetallePedido detalleClienteTres3 = DetallePedido.builder()

                .id(3L)
                .articulo(a2)
                .cantidad(1)
                .build();

        detalleClienteTres3.calcularSubTotal();

        DetallePedido detalleClienteTres4 = DetallePedido.builder()

                .id(3L)
                .articulo(a7)
                .cantidad(2)
                .build();

        detalleClienteTres4.calcularSubTotal();

        Pedido pedidoCliente3 = Pedido.builder()

                .cliente(c3)
                .FechaPedido(LocalDate.now())
                .horaEstimadaFinalizacion(LocalTime.now().plusMinutes(60))
                .estado(Estado.PROCESANDO)
                .tipoEnvio(TipoEnvio.SUCURSAL)
                .formaPago(FormaPago.EFECTIVO)
                .detalles(new HashSet<>(Set.of(detalleClienteTres1,detalleClienteTres2,detalleClienteTres3,detalleClienteTres4)))
                .build();

        Double total3 = pedidoCliente3.getDetalles().stream().mapToDouble(DetallePedido::getSubTotal).sum();
        pedidoCliente3.setTotal(total3);

        pedidoRepository.save(pedidoCliente3);

        System.out.println("Pedido del cliente "+ c2.getNombre() +" : ");
        pedidoCliente3.getDetalles().forEach(detalle -> {
            System.out.println("Artículo: " + detalle.getArticulo().getDenominacion() + ", Cantidad: " + detalle.getCantidad() + ", Subtotal: " + detalle.getSubTotal());
        });
        System.out.println("Total a pagar: " + pedidoCliente3.getTotal());

        //El cliente 1 en otro día realiza un pedido de 1 muzza chica y una cerveza Andes.
        System.out.println("-----------------------------------------");

        DetallePedido detalleClienteUno3 = DetallePedido.builder()

                .id(1L)
                .articulo(a6)
                .cantidad(1)
                .build();

        detalleClienteUno3.calcularSubTotal();

        DetallePedido detalleClienteUno4 = DetallePedido.builder()

                .id(1L)
                .articulo(a7)
                .cantidad(1)
                .build();

        detalleClienteUno4.calcularSubTotal();

        Pedido pedidoCliente4 = Pedido.builder()

                .cliente(c1)
                .FechaPedido(LocalDate.now().plusDays(1))
                .horaEstimadaFinalizacion(LocalTime.now().plusMinutes(30))
                .estado(Estado.ENVIADO)
                .tipoEnvio(TipoEnvio.SUCURSAL)
                .formaPago(FormaPago.EFECTIVO)
                .detalles(new HashSet<>(Set.of(detalleClienteUno3,detalleClienteUno4)))
                .build();

        Double total4 = pedidoCliente4.getDetalles().stream().mapToDouble(DetallePedido::getSubTotal).sum();
        pedidoCliente4.setTotal(total4);

        pedidoRepository.save(pedidoCliente4);

        System.out.println("Pedido del cliente "+ c1.getNombre() +" : ");
        pedidoCliente4.getDetalles().forEach(detalle -> {
            System.out.println("Artículo: " + detalle.getArticulo().getDenominacion() + ", Cantidad: " + detalle.getCantidad() + ", Subtotal: " + detalle.getSubTotal());
        });
        System.out.println("Total a pagar: " + pedidoCliente4.getTotal());

        //Mostar por consola la cantidad de veces que el cliente 1 compró en el local.
        System.out.println("-----------------------------------------");

        long cantidadComprasCliente1 = pedidoRepository.findAll().stream()
                .filter(pedido -> pedido.getCliente().getId().equals(c1.getId()))
                .count();

        System.out.println("El cliente " + c1.getNombre() + " ha comprado en el local " + cantidadComprasCliente1 + " veces.");

        //-	Mostrar todos los artículos que comercializa el negocio
        System.out.println("-----------------------------------------");
        // Mostrar todos los artículos que comercializa el negocio
        List<Articulo> articulos = articuloRepository.findAll();

        System.out.println("Artículos disponibles en el negocio: ");
        articulos.forEach(articulo -> {
            System.out.println("Artículo: " + articulo.getDenominacion() + ", Precio: " + articulo.getPrecioVenta());
        });





    }
}