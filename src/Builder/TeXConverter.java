package Builder;

public class TeXConverter implements TextConverter{

    @Override
    public String converterChar(String string) {
        return "CHAR TeX BUILDER ";
    }

    @Override
    public String converterFontChange(String string) {
        return "FONT TeX BUILDER ";
    }

    @Override
    public String converterParagraph(String string) {
        return "PARAGRAPH TeX BUILDER ";
    }
}
