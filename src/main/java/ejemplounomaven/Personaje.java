package ejemplounomaven;

import org.apache.commons.math3.util.CombinatoricsUtils;

public class Personaje implements IActividades, IMovimiento {

	String nombre;
	double energia;
	double poder;

	Personaje() {
	}

	Personaje(String nombre, int poder, int energia) {
		this.nombre = nombre;
		this.poder = CombinatoricsUtils.factorial(poder);
		this.energia = CombinatoricsUtils.factorial(energia);
	}

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		}
		public double getEnergia () {
		return this.energia;
		}
		public void setEnergia (double vida) {
		this.energia = vida;
		}
		public double getPoder() {
		return this.poder;
		}
		public void setPoder(double poder) {
		this.poder = poder;
		}
		public void ataqueBasico() {
		System.out.println(this.nombre+", ha pegado una patada!");
		}
		
		public void ataqueAvanzado() {
			System.out.println(this.nombre+", ha lanzado un Kamehameha! de
			"+this.poder+" puntos de potencia");
			}
		public void defenderAtaque() {
			System.out.println(this.nombre+", se ha defendido contra el
			ataque!");
			}
			public void esquivarAtaque() {
			System.out.println(this.nombre+ ", lo ha esquivado!");
			}
			public String toString() {
			return "Hola, soy " +this.nombre+ ", mi poder alcanza "+this.poder+" y
			mi energía no supera los "+this.energia;
			}
			public void avanzar() {
			System.out.println(this.nombre+", avanzó hacia adelante");
			}
			public void derecha() {
			System.out.println(this.nombre+", giró a la derecha");
			}
			
			public void izquierda() {
				System.out.println(this.nombre+", giró a la izqueda");
				}
				public void retroceder() {
				System.out.println(this.nombre+", retrocedió");
				}
				}
}