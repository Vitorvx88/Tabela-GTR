package tabela;

public class AttLista {
	private int ID;
	private int Abates=0;
	private int Quedas=0;
	private String Time;
	private int total=0;
	private int Index=0;
	private String setar;
	
	public AttLista () {
		
	}
	public AttLista (int id,String nome,int quedas,int abates,int total) {
		this.ID=id;
		this.Time=nome;
		this.Quedas=quedas;
		this.Abates=abates;
		this.total=total;
		
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getAbates() {
		return Abates;
	}
	public void setAbates(int abates) {
		Abates = abates;
	}
	public int getQuedas() {
		return Quedas;
	}
	public void setQuedas(int quedas) {
		Quedas = quedas;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public int getIndex() {
		return Index;
	}
	public void setIndex(int index) {
		Index = index;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	public String getSetar() {
		return setar;
	}
	public void setSetar(String setar) {
		this.setar = setar;
	}
	
}
