package Repositorio;

import java.util.ArrayList;

import Dadoss.AttLista;
import Dadoss.Tabela;


public class Adicionar {
	private String nome;
	private static int abates;
	private static int queda1;
	private static int queda2;
	private int index;
	private static int number;
	private static String setar;
	private static String lb;
	private static String lb1;
	private static String lb2;
	private static int cont;

	public static ArrayList <Tabela> tabela = new ArrayList<>();
	public static ArrayList <AttLista> att = new ArrayList<>();
	
	
	public static void atzTab(ArrayList <Tabela> att) {
		
	}
	//Adiciona na lista de atualização
	public static void AddTb(AttLista  Adiconar){
		att.add(Adiconar);	
	}
	//Adiciona na lista do tipo Tabela
	public static void Add(Tabela Adicionar){
		tabela.add(Adicionar);	
	}
	
	public static void Setar(String s) {
		setar=s;
	}
	//Verifica se só contem números
    public static boolean soConterNumeros(String valores) {
        if(valores == null)
            return false;
        for (char letra : valores.toCharArray())
            if(letra < '0' || letra > '9')
                return false;
        return true;
         
    }
    //Busca o endereço na lista do tipo tabela
    public static boolean buscar(int ID){
        boolean achei=false;
        
        for(Tabela u:tabela){
            
            if(u.getID()==(ID)){
                achei=true;
            }
        }
    	return achei; 
    }
	//Verifica se já exite o time a ser cadastrado
	public static boolean Verificar(String produto){
		boolean achei=false;
		for(int i=0; i < tabela.size(); i++) {
			if(tabela.get(i).getTime().equals(produto)) {
				achei=true;
				break;
			}
		}
		return achei;
	}
	

	//Verificar se exite algum empate na tabela
	public static boolean Empate(int x, int id) {
		boolean r=false;
		for(int i=0;i<Adicionar.tabela.size();i++) {
			if(Adicionar.tabela.get(i).getID()==id) {
				i++;
			}
			else {
				if(Adicionar.tabela.get(i).getTotal()==x)
					r = true;
			}
		}
		return r;
	}
	//Retorna a pontução de acordo com a colocação 
	public static int Posicao(int posicao) {
		if(posicao==1) {
			posicao=20;
		}
		else if(posicao==2) {
			posicao=17;
		}
		else if(posicao==3) {
			posicao=15;
		}
		else if(posicao==4) {
			posicao=13;
		}
		else if(posicao==5) {
			posicao=12;
		}
		else if(posicao==6) {
			posicao=10;
		}
		else if(posicao==7) {
			posicao=6;
		}
		else if(posicao==8) {
			posicao=4;
		}
		else if(posicao==9) {
			posicao=3;
		}
		else if(posicao==10) {
			posicao=2;
		}
		else if(posicao==11) {
			posicao=1;
		}
		else
			posicao=0;
		
		return posicao;
	}
	/*------------------------Getters_and_Setters----------------------------------------*/
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAbates() {
		return abates;
	}

	public void setAbates(int abates) {
		Adicionar.abates = Adicionar.abates + abates;
	}
	
	public void setAbates2(int abates) {
		Adicionar.abates = abates;
	}

	public int getQueda1() {
		return queda1;
	}

	public void setQueda1(int queda1) {
		Adicionar.queda1 = queda1;
	}

	public int getQueda2() {
		return queda2;
	}

	public void setQueda2(int queda2) {
		Adicionar.queda2 = queda2;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getSetar() {
		return setar;
	}

	public void setSetar(String setar) {
		Adicionar.setar = setar;
	}

	public static String getLb() {
		return lb;
	}

	public static void setLb(String lb) {
		Adicionar.lb = lb;
	}

	public static String getLb1() {
		return lb1;
	}

	public static void setLb1(String lb1) {
		Adicionar.lb1 = lb1;
	}

	public static String getLb2() {
		return lb2;
	}

	public static void setLb2(String lb2) {
		Adicionar.lb2 = lb2;
	}


	public static int getNumber() {
		return number;
	}


	public static void setNumber(int number) {
		Adicionar.number = number;
	}
	public static int getCont() {
		return cont;
	}
	public static void setCont(int cont) {
		Adicionar.cont = Adicionar.cont +cont;
	}
}
