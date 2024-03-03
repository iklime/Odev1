public class maraton {
    private int[] degree;
    private String[] names;

    public maraton (int[] degree,String[]names){
        this.degree=degree;
        this.names=names;
    }
    public void sortNames() {
        for (int i = 0; i<degree.length;i ++) {
            for (int j = 0; j < degree.length-i-1; j++) {
                if (degree[j]>degree[j+1]){
                    swapdegree(j);
                    swapNames(j);
                }
            }
        }
    }


    private void swapNames(int j){
        String tempNames;
        tempNames=names[j];
        names[j]=names[j+1];
        names[j+1]=tempNames;
    }


    private void swapdegree(int index){
        int tempdegree;
        tempdegree=degree[index];
        degree[index]=degree[index+1];
        degree[index+1]=tempdegree;
    }

    public void birinci(){
        System.out.println("Birinci: " + names[0] + " " + degree[0]+"'");
    }

    public void ikinci(){
        System.out.println("İkinci: "+names[1]+" "+degree[1]+"'");
    }
    public void üçüncü(){
        System.out.println("Üçüncü: "+names[2]+" "+degree[2]+"'");

    }

    public void rankNames(){
        int A=0;
        int B=0;
        int C=0;

        for (int i = 0; i <degree.length ; i++) {
            if (degree[i]<300){
                A++;
            } else if (degree[i]<400) {
                B++;
            }
            else {
                C++;
            }
        }
        System.out.println("A-> " + A);
        System.out.println("B-> " + B);
        System.out.println("C-> " + C);
    }





























}