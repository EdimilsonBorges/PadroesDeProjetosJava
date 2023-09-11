package Builder;

public class RTFReader {

    private TextConverter builder;

    public RTFReader(TextConverter builder){
        this.builder = builder;
    }

    public void setBuilder(TextConverter builder){
        this.builder = builder;
    }

    public String parseRTF(String string){

        String saida = "";

        String[] tokens = string.split(" ");
        for (String text: tokens) {
           switch (text){
               case "char":
                   saida += builder.converterChar(text);
                break;
                case "font":
                    saida += builder.converterFontChange(text);
                   break;
               case "para":
                   saida += builder.converterParagraph(text);
                   break;
           }
        }

        return saida;
    }
}
