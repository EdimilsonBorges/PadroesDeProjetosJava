package Builder;

public class ASCIIConverter implements TextConverter{

    @Override
    public String converterChar(String string) {
        return "CHAR ASCII BUILDER ";
    }

    @Override
    public String converterFontChange(String string) {
        return "FONT ASCII BUILDER ";
    }

    @Override
    public String converterParagraph(String string) {
        return "PARAGRAPH ASCII BUILDER ";
    }
}
