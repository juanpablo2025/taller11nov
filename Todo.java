import java.util.Scanner;

public class Todo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita un número del taller o digita 0(cero)para salir: ");
		int z = sc.nextInt();

		/* ==========PUNTO 1========== */
		if (z == 1) {
			Scanner a = new Scanner(System.in);
			String nombre = "", men = "";
			double salaHora = 0, horatra = 0, bruto = 0, neto = 0, bon = 0, dedu = 0;
			System.out.println("Punto 1");

			for (int i = 1; i <= 10; i++) {
				System.out.print("Ingresar nombre del trabajador " + i + " : ");
				nombre = a.next();
				System.out.print("Ingresar valor de la hora: ");
				salaHora = a.nextDouble();
				System.out.print("Ingresar horas trabajadas: ");
				horatra = a.nextDouble();
				System.out.print("Ingresar bonificaciones: ");
				bon = a.nextDouble();
				System.out.print("Ingresar deducciones: ");
				dedu = a.nextDouble();

				bruto = salaHora * horatra;
				neto = bruto + bon - dedu;

				men += nombre + "\n Salario bruto: " + bruto + "\n Salario neto: " + neto + "\n";
			}
			System.out.println("\n" + men);
			Todo.main(null);
		}

		/* ==========PUNTO 2=========== */

		if (z == 2) {
			Scanner p = new Scanner(System.in);
			String nomart = "", linea = "";
			double precioArt = 0, bruto = 0, neto = 0, iva = 0, acum = 0;
			int cantart = 0, c = 0;

			System.out.println("Punto 2");

			System.out.println("Ingrese el numero de productos");
			c = p.nextInt();
			for (int i = 1; i <= c; i++) {
				System.out.print("Ingresar nombre del articulo " + i + " : ");
				nomart = p.next();
				System.out.print(
						"Ingresar la linea teniendo encuanta que \n  A=alimento, F=ferretería, V=vestidos, E= electrodoméstico: ");
				linea = p.next();
				System.out.print("Ingresar Precio unitario: ");
				precioArt = p.nextDouble();
				System.out.print("Ingresar Cantidad de artculos: ");
				cantart = p.nextInt();

				bruto = precioArt * cantart;

				if (linea.equals("A") || linea.equals("a")) {

					iva = bruto * 0.04;
					neto = bruto + iva;
					System.out.println("Compro: " + nomart);
					System.out.println("Valor bruto: " + bruto);
					System.out.println("Valor IVA: " + iva);
					System.out.println("Valor neto: " + neto);

				} else if (linea.equals("F") || linea.equals("f")) {

					iva = bruto * 0.19;
					neto = bruto + iva;
					System.out.println("Compro: " + nomart);
					System.out.println("Valor bruto: " + bruto);
					System.out.println("Valor IVA: " + iva);
					System.out.println("Valor neto: " + neto);

				} else if (linea.equals("V") || linea.equals("v")) {

					iva = bruto * 0.15;
					neto = bruto + iva;
					System.out.println("Compro: " + nomart);
					System.out.println("Valor bruto: " + bruto);
					System.out.println("Valor IVA: " + iva);
					System.out.println("Valor neto: " + neto);

				} else if (linea.equals("E") || linea.equals("e")) {

					iva = bruto * 0.22;
					neto = bruto + iva;
					System.out.println("Compro: " + nomart);
					System.out.println("Valor bruto: " + bruto);
					System.out.println("Valor IVA: " + iva);
					System.out.println("Valor neto: " + neto);

				} else {
					System.out.println("No mi rey, no se reconoce");
				}
				acum += neto;

			}
			System.out.println("El valor de Todos los articulos vendidos es: " + acum + "\n");
			Todo.main(null);
		}

		/* ===========PUNTO 3============ */

		if (z == 3) {
			Scanner T = new Scanner(System.in);
			String nombre = "", men = "", sexo = "", estadoc = "";
			double estatura = 0;
			int edad = 0;

			System.out.println("Punto 3");
			for (int i = 1; i <= 20; i++) {

				System.out.print("Ingresar nombre " + i + " : ");
				nombre = T.next();
				System.out.print("Ingresar el sexo: m=masculino, f=femenino: ");
				sexo = T.next();
				System.out.print("Ingresar la edad: ");
				edad = T.nextInt();
				System.out.print("Ingresar estatura: ");
				estatura = T.nextDouble();
				System.out.print("Ingresar el estado civil: c=Casado, s=Soltero, u=Unión libre ");
				estadoc = T.next();

				if (estatura > 1.80 && edad > 17 && sexo.equals("f") && estadoc.equals("s")) {
					System.out.println(nombre);
					men += "\n" + nombre;
				} else {
					System.out.println("No cumple las condiciones");
				}
			}

			System.out.println("\n" + men + "\n");
		}
		if (z == 0) {
			System.out.print("Cerrando...");
			System.exit(0);

		} else if (z >= 4) {
			System.out.println("No cumple las condiciones");
			Todo.main(null);
		}
	}
}