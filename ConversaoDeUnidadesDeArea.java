public class ConversaoDeUnidadesDeArea {
    public static double metroParaPes(double valorEmMetros){
        double metro = 10.76;
        return valorEmMetros * metro;
    }

    public static double pesParaCentimetros(double valorEmPes){
        double pe = 929;
        return valorEmPes * pe;
    }

    public static double milhaParaAcres(double valorEmMilha){
        double milha = 640;
        return valorEmMilha * milha;
    }

    public static double acreParaPes(double valorEmAcre){
        double acre = 43560;
        return valorEmAcre * acre;
    }
}