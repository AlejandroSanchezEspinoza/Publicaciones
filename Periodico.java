package publicacion;

public class Periodico extends Publicacion implements Periodicidad
{
    private String editor;

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
    
      @Override
    public String getPeriodicidad()//implementación del método
    {
     return periodicidad;
    }
}