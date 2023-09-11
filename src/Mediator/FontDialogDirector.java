package Mediator;

public class FontDialogDirector extends DialogDirector{

    private ListBox listBox;
    private EntryField entryField;

    public EntryField getEntryField() {
        return entryField;
    }

    @Override
    public void createWidget() {
        listBox = new ListBox(this);
        entryField = new EntryField(this);
    }

    @Override
    public void widgetChanged(Widget widget) {
        listBox.getSelection();
    }
}
