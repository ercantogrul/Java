package z_calismalar.OCI_sinav._223.Q051_ONEMLI_63_76_polm___;

interface Exportable{
	  void export(); //  Tum method’lar public ve abstract’dir. Bu keywor’ler yazilsa da yazilmasa da
}
class Tool implements Exportable{
	//public yerinde protected var normalde daha alt Access modifiert kullanilinca CTE verir
	   public void export() {						// line n1
	    	System.out.println("Tool::export");
	}
}
 class ReportTool extends Tool implements Exportable {
	public void export() {							// line n2

		System.out.println("RTool::export");
	}
	public static void main(String[] args) {
		Tool aTool = new ReportTool();
		Tool bTool = new Tool();
		callExport(aTool);
		callExport(bTool);
	}
	public static void callExport(Exportable ex) {
		ex.export();
	}
}
//What is the result?
//A.	Compilation fails only at line n2.
//B.	RTool::exportTool::export
//C.	Tool::exportTool:export
//D.	Compilation fails only at line n1.
//E.	Compilation fails at both line n1 and line n2.
