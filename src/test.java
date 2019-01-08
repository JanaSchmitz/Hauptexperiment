public class test {
    enum Eins{EINS, ZWEI};
    enum Zwei{DREI, VIER;}


    public void testmethod(Eins eins,Zwei zwei){
        Eins test;
        test = Eins.EINS;
       if(test == Eins.EINS){
            Zwei test2 = Zwei.DREI;
        }

    }
}
