
public class testclass {

    public static void main(String[] args){
       // Window w = new Window();
      //  w.createWindow();

      //for(int i = 0; i < 1000; i++) {
            GenerationParameter p = new GenerationParameter(3, 3, CodeType.IF, 36, EnumModus.UPPERCASE, IdentifierArt.randomIdentifier);
            CodeGenerator g = new CodeGenerator(p);
            //p.getModus();
            g.generateCode();
        //}
        //System.out.println("FERTIG");





    }
}
