public class Ring{

    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight){

        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    void run(){

        if(isCheck()){

            System.out.println("Sikletler Uygun Mac Basliyor");
            int i=1;          
            while(this.f1.health>0 &&this.f2.health>0){
                System.out.println("\n==== "+ i + ".  Round Basladi  ====\n");
                ++i;
                this.f2.health=this.f1.hit(f2);
                    if(isWin())
                        break;
                System.out.println(f2.name + " cani : " +f2.health + " kaldi.");

                this.f1.health=this.f2.hit(f1);
                    if(isWin())
                        break;
                System.out.println(f1.name + " cani : " +f1.health + " kaldi.");
            }
            
        }
        else 
            System.out.println("Sporcuşarin sikletleri uymuyor.");
    }

    boolean isCheck(){

        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }

    boolean isWin(){

        if(this.f1.health==0){
            System.out.println("\n"+f1.name+"\tYerde\n\nKazanan )==> " + this.f2.name + " <==(");
            return true;
        }
        if(this.f2.health==0){
            System.out.println("\n"+f2.name+"\tYerde\n\nKazanan )==> " + this.f1.name + " <==(");
            return true;
        }

        return false; //musabaka devam ediyor.
    }
}
