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
    public String getPeriodicidad()//implementaci�n del m�todo
    {
     return periodicidad;
    }
}