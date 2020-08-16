package Dadoss;

public class Vetores {
	private static boolean Vrf=false;
	private static int vet[]=new int[12];
	private static boolean Vrf2=false;
	private static int vet2[]=new int[12];
	private static boolean Vrf3=false;
	private static int vet3[]=new int[12];
	
	/*---------------------Primeiro_Vetor------------------------*/
	public static boolean vetExiste(int x) {
		for(int i=0; i< vet.length; i++) {
			if(vet[i]==x) {
				return true;
			}
		}
		return false;
	}
	public static boolean vetAdd(int x) {
		for(int i=0; i< vet.length; i++) {
			if(vet[i]==0) {
				vet[i]=x;
				return true;
			}
		}
		return false;
	}
	public static boolean getVrf() {
		return Vrf;
	}

	public static void setVrf(boolean vrf) {
		Vrf = vrf;
	}
	/*---------------------Segundo_Vetor------------------------*/
	public static boolean vetExiste2(int x) {
		for(int i=0; i< vet2.length; i++) {
			if(vet2[i]==x) {
				return true;
			}
		}
		return false;
	}
	public static boolean vetAdd2(int x) {
		for(int i=0; i< vet2.length; i++) {
			if(vet2[i]==0) {
				vet2[i]=x;
				return true;
			}
		}
		return false;
	}
	public static boolean getVrf2() {
		return Vrf2;
	}

	public static void setVrf2(boolean vrf) {
		Vrf2 = vrf;
	}
	/*---------------------Terceiro_Vetor------------------------*/
	public static boolean vetExiste3(int x) {
		for(int i=0; i< vet3.length; i++) {
			if(vet3[i]==x) {
				return true;
			}
		}
		return false;
	}
	public static boolean vetAdd3(int x) {
		for(int i=0; i< vet3.length; i++) {
			if(vet3[i]==0) {
				vet3[i]=x;
				return true;
			}
		}
		return false;
	}
	public static boolean getVrf3() {
		return Vrf3;
	}

	public static void setVrf3(boolean vrf) {
		Vrf3 = vrf;
}
}
