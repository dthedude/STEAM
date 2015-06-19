public class Directory {

    public static void main(String [] args){
        Data betterBob = new Data("Bob", "Smith", 10);
        System.out.println(betterBob.getFirstName() + " " + betterBob.getLastName() + " " + betterBob.getAge());

        Data bob = new Data();
        bob.setFirstName("Mr. Bob");
        bob.setLastName("Jamacia");
        System.out.println(bob.getFirstName());
        System.out.println(bob.getLastName());
        
        Data susie = new Data();
        susie.setFirstName("Susie");
        susie.setLastName("Smith");
        System.out.println(susie.getFirstName());
        System.out.println(susie.getLastName());
        
        Data alec = new Data();
        alec.setFirstName("Alec");
        alec.setLastName("Smith");
        System.out.println(alec.getFirstName());
        System.out.println(alec.getLastName());
       
        Data [] bob_relations = new Data[2];
        bob_relations[0]=susie;
        bob_relations[1]=alec;
        bob.setRelations(bob_relations);

        System.out.println("Here are Bob's Relations:");

        for(Data data: bob.getRelations()){
            System.out.println(data.getFirstName());
        }
    }//main
}//Directory
