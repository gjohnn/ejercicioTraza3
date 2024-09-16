package org.example;

import org.example.clases.Articulo;
import org.example.clases.Cliente;
import org.example.clases.Imagenes;
import org.example.clases.UnidadMedida;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        //Clientes
        Cliente c1 = Cliente.builder()
                .id(1L)
                .email("pepito@gmail.com")
                .apellido("Juarez")
                .nombre("Pepito")
                .fechaNacimiento(LocalDate.of(1995, 9, 5))
                .telefono("25614895")
                .build();

        Cliente c2 = Cliente.builder()
                .id(2L)
                .email("maria.lopez@gmail.com")
                .apellido("Lopez")
                .nombre("Maria")
                .fechaNacimiento(LocalDate.of(1988, 3, 12))
                .telefono("35874126")
                .build();

        Cliente c3 = Cliente.builder()
                .id(3L)
                .email("carlos.perez@hotmail.com")
                .apellido("Perez")
                .nombre("Carlos")
                .fechaNacimiento(LocalDate.of(2000, 11, 22))
                .telefono("41235698")
                .build();
        //Clientes

        //UnidadesDeMedidas
        UnidadMedida u1 = UnidadMedida.builder()
                .id(1L)
                .denominacion("8 Pociones")
                .build();

        UnidadMedida u2 = UnidadMedida.builder()
                .id(2L)
                .denominacion("4 Porciones")
                .build();

        UnidadMedida u3 = UnidadMedida.builder()
                .id(3L)
                .denominacion("1 Litro")
                .build();
        //UnidadesDeMedidas

        //Imagenes
        Imagenes i1 = Imagenes.builder()
                .id(1L)
                .nombre("Pizza Grande Hawaina")
                .url("https://www.hola.com/horizon/landscape/a17cd68660e0-pizza-hawaiana-t.jpg?im=Resize=(960),type=downsize")
                .build();

        Imagenes i2 = Imagenes.builder()
                .id(2L)
                .nombre("Pizza Grande Napolitana")
                .url("https://www.example.com/pizza-napolitana-grande.jpg")
                .build();

        Imagenes i3 = Imagenes.builder()
                .id(3L)
                .nombre("Pizza Grande Muzza")
                .url("https://www.example.com/pizza-muzza-grande.jpg")
                .build();

        Imagenes i4 = Imagenes.builder()
                .id(4L)
                .nombre("Pizza Chica Hawaiana")
                .url("https://www.example.com/pizza-hawaiana-chica.jpg")
                .build();

        Imagenes i5 = Imagenes.builder()
                .id(5L)
                .nombre("Pizza Chica Napolitana")
                .url("https://www.example.com/pizza-napolitana-chica.jpg")
                .build();

        Imagenes i6 = Imagenes.builder()
                .id(6L)
                .nombre("Pizza Chica Muzza")
                .url("https://www.example.com/pizza-muzza-chica.jpg")
                .build();

        Imagenes i7 = Imagenes.builder()
                .id(7L)
                .nombre("Cerveza Andes")
                .url("https://www.example.com/cerveza-andes.jpg")
                .build();

        Imagenes i8 = Imagenes.builder()
                .id(8L)
                .nombre("Cerveza Quilmes")
                .url("https://www.example.com/cerveza-quilmes.jpg")
                .build();
        //Imagenes

        //Articulos
        Articulo a1 = Articulo.builder()
                .id(1L)
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
                .id(2L)
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
                .id(3L)
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
                .id(4L)
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
                .id(5L)
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
                .id(6L)
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
                .id(7L)
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
        //Articulos

        //Pedidos

        

        System.out.println(c1.getNombre());
    }
}