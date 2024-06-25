package tpPoo;

import java.util.LinkedList;

import javax.swing.JOptionPane;

class Main {

    public static void main(String[] args) {
    	 GestorEquipo gestorEquipo = new GestorEquipo();
    	 


         // Crear equipos y agregar jugadores
         Equipo equipo1 = new Equipo("Boca Juniors", "La Boca");
         equipo1.agregarMiembro(new Jugador("Esteban Andrada", "Portero", 1, 30));
         equipo1.agregarMiembro(new Jugador("Julio Buffarini", "Defensa", 4, 32));
         equipo1.agregarMiembro(new Jugador("Carlos Izquierdoz", "Defensa", 24, 32));
         equipo1.agregarMiembro(new Jugador("Lisandro López", "Defensa", 2, 31));
         equipo1.agregarMiembro(new Jugador("Frank Fabra", "Defensa", 18, 29));
         equipo1.agregarMiembro(new Jugador("Jorman Campuzano", "Mediocampista", 21, 24));
         equipo1.agregarMiembro(new Jugador("Eduardo Salvio", "Mediocampista", 11, 30));
         equipo1.agregarMiembro(new Jugador("Guillermo Fernández", "Mediocampista", 8, 29));
         equipo1.agregarMiembro(new Jugador("Sebastián Villa", "Delantero", 22, 24));
         equipo1.agregarMiembro(new Jugador("Carlos Tevez", "Delantero", 10, 37));
         equipo1.agregarMiembro(new Jugador("Franco Soldano", "Delantero", 27, 26));
         gestorEquipo.agregarEquipo(equipo1);

         Equipo equipo2 = new Equipo("River Plate", "Nuñez");
         equipo2.agregarMiembro(new Jugador("Franco Armani", "Portero", 1, 34));
         equipo2.agregarMiembro(new Jugador("Gonzalo Montiel", "Defensa", 29, 24));
         equipo2.agregarMiembro(new Jugador("Robert Rojas", "Defensa", 2, 25));
         equipo2.agregarMiembro(new Jugador("Paulo Díaz", "Defensa", 17, 26));
         equipo2.agregarMiembro(new Jugador("Milton Casco", "Defensa", 20, 33));
         equipo2.agregarMiembro(new Jugador("Enzo Pérez", "Mediocampista", 24, 35));
         equipo2.agregarMiembro(new Jugador("Nicolás De La Cruz", "Mediocampista", 11, 24));
         equipo2.agregarMiembro(new Jugador("Ignacio Fernández", "Mediocampista", 26, 31));
         equipo2.agregarMiembro(new Jugador("Julián Álvarez", "Delantero", 9, 21));
         equipo2.agregarMiembro(new Jugador("Matías Suárez", "Delantero", 7, 32));
         equipo2.agregarMiembro(new Jugador("Rafael Borré", "Delantero", 19, 25));
         gestorEquipo.agregarEquipo(equipo2);
         
         Equipo equipo3 = new Equipo("Independiente", "Avellaneda");
         equipo3.agregarMiembro(new Jugador("Martín Campaña", "Portero", 25, 32));
         equipo3.agregarMiembro(new Jugador("Fabricio Bustos", "Defensa", 4, 25));
         equipo3.agregarMiembro(new Jugador("Alan Franco", "Defensa", 2, 24));
         equipo3.agregarMiembro(new Jugador("Alexander Barboza", "Defensa", 6, 26));
         equipo3.agregarMiembro(new Jugador("Juan Sánchez Miño", "Defensa", 3, 31));
         equipo3.agregarMiembro(new Jugador("Lucas Romero", "Mediocampista", 5, 26));
         equipo3.agregarMiembro(new Jugador("Alan Soñora", "Mediocampista", 20, 21));
         equipo3.agregarMiembro(new Jugador("Domingo Blanco", "Mediocampista", 8, 26));
         equipo3.agregarMiembro(new Jugador("Silvio Romero", "Delantero", 9, 32));
         equipo3.agregarMiembro(new Jugador("Sebastián Palacios", "Delantero", 29, 29));
         equipo3.agregarMiembro(new Jugador("Jonathan Menéndez", "Delantero", 11, 26));
         gestorEquipo.agregarEquipo(equipo3);

         Equipo equipo4 = new Equipo("Racing Club", "Avellaneda");
         equipo4.agregarMiembro(new Jugador("Gabriel Arias", "Portero", 1, 34));
         equipo4.agregarMiembro(new Jugador("Iván Pillud", "Defensa", 4, 35));
         equipo4.agregarMiembro(new Jugador("Leonardo Sigali", "Defensa", 28, 34));
         equipo4.agregarMiembro(new Jugador("Nery Domínguez", "Defensa", 6, 31));
         equipo4.agregarMiembro(new Jugador("Eugenio Mena", "Defensa", 3, 33));
         equipo4.agregarMiembro(new Jugador("Leonel Miranda", "Mediocampista", 20, 27));
         equipo4.agregarMiembro(new Jugador("Matías Rojas", "Mediocampista", 8, 25));
         equipo4.agregarMiembro(new Jugador("Lorenzo Melgarejo", "Mediocampista", 29, 30));
         equipo4.agregarMiembro(new Jugador("Héctor Fértoli", "Delantero", 7, 26));
         equipo4.agregarMiembro(new Jugador("Darío Cvitanich", "Delantero", 20, 37));
         equipo4.agregarMiembro(new Jugador("Jonatan Cristaldo", "Delantero", 9, 32));
         gestorEquipo.agregarEquipo(equipo4);

         Equipo equipo5 = new Equipo("San Lorenzo", "Boedo");
         equipo5.agregarMiembro(new Jugador("Sebastián Torrico", "Portero", 1, 41));
         equipo5.agregarMiembro(new Jugador("Gonzalo Rodríguez", "Defensa", 2, 37));
         equipo5.agregarMiembro(new Jugador("Bruno Pittón", "Defensa", 3, 27));
         equipo5.agregarMiembro(new Jugador("Víctor Salazar", "Defensa", 4, 28));
         equipo5.agregarMiembro(new Jugador("Gabriel Rojas", "Defensa", 5, 24));
         equipo5.agregarMiembro(new Jugador("Juan Ramírez", "Mediocampista", 6, 24));
         equipo5.agregarMiembro(new Jugador("Nicolás Fernández", "Mediocampista", 7, 27));
         equipo5.agregarMiembro(new Jugador("Óscar Romero", "Mediocampista", 8, 29));
         equipo5.agregarMiembro(new Jugador("Ángel Romero", "Delantero", 9, 29));
         equipo5.agregarMiembro(new Jugador("Nicolás Reniero", "Delantero", 10, 26));
         equipo5.agregarMiembro(new Jugador("Adolfo Gaich", "Delantero", 11, 22));
         gestorEquipo.agregarEquipo(equipo5);

         Equipo equipo6 = new Equipo("Vélez Sarsfield", "Liniers");
         equipo6.agregarMiembro(new Jugador("Lucas Hoyos", "Portero", 12, 35));
         equipo6.agregarMiembro(new Jugador("Tomás Guidara", "Defensa", 13, 24));
         equipo6.agregarMiembro(new Jugador("Lautaro Gianetti", "Defensa", 14, 28));
         equipo6.agregarMiembro(new Jugador("Miguel Brizuela", "Defensa", 15, 23));
         equipo6.agregarMiembro(new Jugador("Francisco Ortega", "Defensa", 16, 22));
         equipo6.agregarMiembro(new Jugador("Pablo Galdames", "Mediocampista", 17, 24));
         equipo6.agregarMiembro(new Jugador("Lucas Janson", "Mediocampista", 18, 27));
         equipo6.agregarMiembro(new Jugador("Ricardo Álvarez", "Mediocampista", 19, 31));
         equipo6.agregarMiembro(new Jugador("Agustín Bouzat", "Delantero", 20, 24));
         equipo6.agregarMiembro(new Jugador("Thiago Almada", "Delantero", 21, 20));
         equipo6.agregarMiembro(new Jugador("Cristian Tarragona", "Delantero", 22, 29));
         gestorEquipo.agregarEquipo(equipo6);
         
         Equipo equipo7 = new Equipo("Rosario Central", "Rosario");
         equipo7.agregarMiembro(new Jugador("Josué Ayala", "Portero", 23, 34));
         equipo7.agregarMiembro(new Jugador("Facundo Almada", "Defensa", 24, 22));
         equipo7.agregarMiembro(new Jugador("Diego Novaretti", "Defensa", 25, 35));
         equipo7.agregarMiembro(new Jugador("Jonathan Botinelli", "Defensa", 26, 37));
         equipo7.agregarMiembro(new Jugador("Damián Martínez", "Defensa", 27, 31));
         equipo7.agregarMiembro(new Jugador("Emmanuel Ojeda", "Mediocampista", 28, 22));
         equipo7.agregarMiembro(new Jugador("Diego Zabala", "Mediocampista", 29, 31));
         equipo7.agregarMiembro(new Jugador("Emiliano Vecchio", "Mediocampista", 30, 33));
         equipo7.agregarMiembro(new Jugador("Luciano Ferreyra", "Delantero", 31, 25));
         equipo7.agregarMiembro(new Jugador("Marco Ruben", "Delantero", 32, 34));
         equipo7.agregarMiembro(new Jugador("Nicolás Ferreyra", "Delantero", 33, 27));
         gestorEquipo.agregarEquipo(equipo7);

         Equipo equipo8 = new Equipo("Newell's Old Boys", "Rosario");
         equipo8.agregarMiembro(new Jugador("Alan Aguerre", "Portero", 34, 27));
         equipo8.agregarMiembro(new Jugador("Facundo Nadalín", "Defensa", 35, 25));
         equipo8.agregarMiembro(new Jugador("Fabricio Fontanini", "Defensa", 36, 31));
         equipo8.agregarMiembro(new Jugador("Cristian Lema", "Defensa", 37, 31));
         equipo8.agregarMiembro(new Jugador("Mariano Bíttolo", "Defensa", 38, 31));
         equipo8.agregarMiembro(new Jugador("Aníbal Moreno", "Mediocampista", 39, 22));
         equipo8.agregarMiembro(new Jugador("Pablo Pérez", "Mediocampista", 40, 36));
         equipo8.agregarMiembro(new Jugador("Maximiliano Rodríguez", "Mediocampista", 41, 40));
         equipo8.agregarMiembro(new Jugador("Mauro Formica", "Delantero", 42, 33));
         equipo8.agregarMiembro(new Jugador("Ignacio Scocco", "Delantero", 43, 36));
         equipo8.agregarMiembro(new Jugador("Sebastián Palacios", "Delantero", 44, 25));
         gestorEquipo.agregarEquipo(equipo8);
         
         Equipo equipo9 = new Equipo("Estudiantes", "La Plata");
         equipo9.agregarMiembro(new Jugador("Mariano Andújar", "Portero", 45, 37));
         equipo9.agregarMiembro(new Jugador("Facundo Sánchez", "Defensa", 46, 31));
         equipo9.agregarMiembro(new Jugador("Jonatan Schunke", "Defensa", 47, 33));
         equipo9.agregarMiembro(new Jugador("Nazareno Colombo", "Defensa", 48, 20));
         equipo9.agregarMiembro(new Jugador("Facundo Mura", "Defensa", 49, 21));
         equipo9.agregarMiembro(new Jugador("Nicolás Pasquini", "Mediocampista", 50, 27));
         equipo9.agregarMiembro(new Jugador("David Ayala", "Mediocampista", 51, 20));
         equipo9.agregarMiembro(new Jugador("Manuel Castro", "Mediocampista", 52, 24));
         equipo9.agregarMiembro(new Jugador("Gastón Fernández", "Delantero", 53, 38));
         equipo9.agregarMiembro(new Jugador("Leandro Díaz", "Delantero", 54, 30));
         equipo9.agregarMiembro(new Jugador("Diego García", "Delantero", 55, 24));
         gestorEquipo.agregarEquipo(equipo9);
         
      // Equipo 10
         Equipo equipo10 = new Equipo("Gimnasia y Esgrima LP", "La Plata");
         equipo10.agregarMiembro(new Jugador("Jorge Broun", "Portero", 56, 35));
         equipo10.agregarMiembro(new Jugador("Matías Melluso", "Defensa", 57, 26));
         equipo10.agregarMiembro(new Jugador("Germán Guiffrey", "Defensa", 58, 25));
         equipo10.agregarMiembro(new Jugador("Leonardo Morales", "Defensa", 59, 25));
         equipo10.agregarMiembro(new Jugador("Nicolás Ortíz", "Defensa", 60, 22));
         equipo10.agregarMiembro(new Jugador("José Paradela", "Mediocampista", 61, 25));
         equipo10.agregarMiembro(new Jugador("Harrinson Mancilla", "Mediocampista", 62, 25));
         equipo10.agregarMiembro(new Jugador("Matías Pérez García", "Mediocampista", 63, 36));
         equipo10.agregarMiembro(new Jugador("Erik Ramírez", "Delantero", 64, 21));
         equipo10.agregarMiembro(new Jugador("Lucas Barrios", "Delantero", 65, 37));
         equipo10.agregarMiembro(new Jugador("Jesús Vargas", "Delantero", 66, 24));
         gestorEquipo.agregarEquipo(equipo10);

         // Equipo 11
         Equipo equipo11 = new Equipo("Arsenal", "Sarandí");
         equipo11.agregarMiembro(new Jugador("Nicolás Navarro", "Portero", 67, 36));
         equipo11.agregarMiembro(new Jugador("Fernando Torrent", "Defensa", 68, 22));
         equipo11.agregarMiembro(new Jugador("Mateo Carabajal", "Defensa", 69, 22));
         equipo11.agregarMiembro(new Jugador("Gastón Suso", "Defensa", 70, 29));
         equipo11.agregarMiembro(new Jugador("Jonathan Bottinelli", "Defensa", 71, 37));
         equipo11.agregarMiembro(new Jugador("Julián Navas", "Mediocampista", 72, 27));
         equipo11.agregarMiembro(new Jugador("Emiliano Méndez", "Mediocampista", 73, 21));
         equipo11.agregarMiembro(new Jugador("Julián Giménez", "Mediocampista", 74, 23));
         equipo11.agregarMiembro(new Jugador("Jhonatan Candia", "Delantero", 75, 27));
         equipo11.agregarMiembro(new Jugador("Facundo Kruspzky", "Delantero", 76, 24));
         equipo11.agregarMiembro(new Jugador("Lucas Albertengo", "Delantero", 77, 30));
         gestorEquipo.agregarEquipo(equipo11);

         // Equipo 12
         Equipo equipo12 = new Equipo("Banfield", "Banfield");
         equipo12.agregarMiembro(new Jugador("Facundo Altamirano", "Portero", 78, 28));
         equipo12.agregarMiembro(new Jugador("Emiliano Coronel", "Defensa", 79, 29));
         equipo12.agregarMiembro(new Jugador("Alexis Maldonado", "Defensa", 80, 23));
         equipo12.agregarMiembro(new Jugador("Lautaro Lemos", "Defensa", 81, 24));
         equipo12.agregarMiembro(new Jugador("Juan Álvarez", "Defensa", 82, 24));
         equipo12.agregarMiembro(new Jugador("Martín Payero", "Mediocampista", 83, 22));
         equipo12.agregarMiembro(new Jugador("Nicolás Linares", "Mediocampista", 84, 28));
         equipo12.agregarMiembro(new Jugador("Gabriel Florentín", "Mediocampista", 85, 27));
         equipo12.agregarMiembro(new Jugador("Agustín Fontana", "Delantero", 86, 22));
         equipo12.agregarMiembro(new Jugador("Juan Cruz", "Delantero", 87, 24));
         equipo12.agregarMiembro(new Jugador("Fabian Bordagaray", "Delantero", 88, 34));
         gestorEquipo.agregarEquipo(equipo12);
         
      // Equipo 13
         Equipo equipo13 = new Equipo("Defensa y Justicia", "Florencio Varela");
         equipo13.agregarMiembro(new Jugador("Ezequiel Unsain", "Portero", 89, 26));
         equipo13.agregarMiembro(new Jugador("Marcelo Benítez", "Defensa", 90, 23));
         equipo13.agregarMiembro(new Jugador("Juan Rodríguez", "Defensa", 91, 25));
         equipo13.agregarMiembro(new Jugador("Héctor Martínez", "Defensa", 92, 25));
         equipo13.agregarMiembro(new Jugador("Fernando Meza", "Defensa", 93, 30));
         equipo13.agregarMiembro(new Jugador("Enzo Fernández", "Mediocampista", 94, 24));
         equipo13.agregarMiembro(new Jugador("Raúl Loaiza", "Mediocampista", 95, 30));
         equipo13.agregarMiembro(new Jugador("Francisco Pizzini", "Mediocampista", 96, 26));
         equipo13.agregarMiembro(new Jugador("Walter Bou", "Delantero",97, 27));
         equipo13.agregarMiembro(new Jugador("Braian Romero", "Delantero", 98, 29));
         equipo13.agregarMiembro(new Jugador("Carlos Rotondi", "Delantero", 99, 24));
         equipo13.agregarMiembro(new Jugador("Gonzalo Aliseda", "Delantero", 100, 21));
         gestorEquipo.agregarEquipo(equipo13);
         
         Equipo equipo14 = new Equipo("Aldosivi", "Mar del Plata");
         equipo14.agregarMiembro(new Jugador("José Devecchi", "Portero", 101, 26));
         equipo14.agregarMiembro(new Jugador("Federico Milo", "Defensa", 102, 32));
         equipo14.agregarMiembro(new Jugador("Emiliano Insúa", "Defensa", 103, 32));
         equipo14.agregarMiembro(new Jugador("Nicolás Bazzana", "Defensa", 104, 27));
         equipo14.agregarMiembro(new Jugador("Fabricio Coloccini", "Defensa", 105, 39));
         equipo14.agregarMiembro(new Jugador("Gastón Gil Romero", "Mediocampista", 106, 28));
         equipo14.agregarMiembro(new Jugador("Leandro Maciel", "Mediocampista", 107, 26));
         equipo14.agregarMiembro(new Jugador("Francisco Grahl", "Mediocampista", 108, 27));
         equipo14.agregarMiembro(new Jugador("Nahuel Yeri", "Mediocampista", 109, 31));
         equipo14.agregarMiembro(new Jugador("Federico Andrada", "Delantero", 110, 26));
         equipo14.agregarMiembro(new Jugador("Lautaro Guzmán", "Delantero", 111, 24));
         equipo14.agregarMiembro(new Jugador("Javier Iritier", "Delantero", 112, 26));
         gestorEquipo.agregarEquipo(equipo14);
         
         Equipo equipo15 = new Equipo("Huracán", "Parque Patricios");
         equipo15.agregarMiembro(new Jugador("Fernando Pellegrino", "Portero", 113, 34));
         equipo15.agregarMiembro(new Jugador("Ezequiel Bonifacio", "Defensa", 114, 27));
         equipo15.agregarMiembro(new Jugador("Renato Civelli", "Defensa", 115, 37));
         equipo15.agregarMiembro(new Jugador("Raúl Abila", "Defensa", 116, 23));
         equipo15.agregarMiembro(new Jugador("César Ibáñez", "Defensa", 117, 23));
         equipo15.agregarMiembro(new Jugador("Francisco Ramírez", "Mediocampista", 118, 24));
         equipo15.agregarMiembro(new Jugador("Adrián Arregui", "Mediocampista", 119, 28));
         equipo15.agregarMiembro(new Jugador("Cristian Núñez", "Mediocampista", 120, 26));
         equipo15.agregarMiembro(new Jugador("Daniel Hernández", "Delantero", 121, 27));
         equipo15.agregarMiembro(new Jugador("Javier Mendoza", "Delantero", 122, 29));
         equipo15.agregarMiembro(new Jugador("Nicolás Cordero", "Delantero", 123, 23));
         gestorEquipo.agregarEquipo(equipo15);
         
         Equipo equipo16 = new Equipo("Atlético Tucumán", "Tucumán");
         equipo16.agregarMiembro(new Jugador("Cristian Lucchetti", "Portero", 135, 43));
         equipo16.agregarMiembro(new Jugador("Marcelo Ortiz", "Defensa", 136, 32));
         equipo16.agregarMiembro(new Jugador("Mauro Osores", "Defensa", 137, 24));
         equipo16.agregarMiembro(new Jugador("Lucas Meza", "Defensa", 138, 25));
         equipo16.agregarMiembro(new Jugador("Augusto Lotti", "Defensa", 139, 23));
         equipo16.agregarMiembro(new Jugador("Guillermo Acosta", "Mediocampista", 140, 29));
         equipo16.agregarMiembro(new Jugador("Juan Mercier", "Mediocampista", 141, 40));
         equipo16.agregarMiembro(new Jugador("Gonzalo Castellani", "Mediocampista", 142, 32));
         equipo16.agregarMiembro(new Jugador("Ramiro Ruiz Rodríguez", "Delantero", 143, 22));
         equipo16.agregarMiembro(new Jugador("Leonardo Heredia", "Delantero", 144, 23));
         equipo16.agregarMiembro(new Jugador("Javier Toledo", "Delantero", 145, 32));
         gestorEquipo.agregarEquipo(equipo16);
         // muestro el menú
         mostrarMenu(gestorEquipo);
     }
    
    public static void mostrarMenu(GestorEquipo gestorEquipo) {
        String[] opciones = {
            "Mostrar equipos",
            "Buscar equipo por nombre",
            "Modificar jugador",
            "Eliminar jugador",
            "Agregar club",
            "Eliminar club",
            "Simular torneo",
            "Salir"
        };

        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción",
                "Torneo de Fútbol",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]
            );

            switch (opcion) {
                case 0:
                    gestorEquipo.mostrarEquipos(gestorEquipo);
                    break;
                case 1:
                    String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo a buscar:");
                    Equipo equipo = gestorEquipo.buscarEquipoPorNombre(nombreEquipo);
                    if (equipo != null) {
                        JOptionPane.showMessageDialog(null, "Equipo encontrado: " + equipo.getNombre());
                    } else {
                        JOptionPane.showMessageDialog(null, "Equipo no encontrado.");
                    }
                    break;
                case 2:
                    gestorEquipo.modificarJugador(gestorEquipo);
                    break;
                case 3:
                    gestorEquipo.eliminarJugador(gestorEquipo);
                    break;
                case 4:
                    gestorEquipo.agregarEquipo(gestorEquipo);
                    break;
                case 5:
                    gestorEquipo.eliminarClub(gestorEquipo);
                    break;
                case 6:
                    gestorEquipo.simularTorneo(gestorEquipo);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;
                default:
                    break;
            }
        } while (opcion != 7);
    }
}