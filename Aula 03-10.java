class Livro{
    String titulo;
    String autor;
    int ano;
    String editora;
    
    String getTitulo(){
        return titulo;
    }
    
    String getAutor(){
        return autor;
    }
    
    int getAno(){
        return ano;
    }
    
    String getEditora(){
        return editora;
    }
    
    void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    void setAutor(String autor){
        this.autor = autor;
    }
    
    void setAno(int ano){
        this.ano = ano;
    }
    
    void setEditora(String editora){
        this.editora = editora;
    }
}

public class TestaLivro{
    public static void main(String[] args) {
        Livro LivroUm = new Livro();
        Livro LivroDois = new Livro();
        Livro LivroTres = new Livro();  
        
        LivroUm.setTitulo("The Lost Bookshop");
        LivroUm.setAutor("Evie Woods");
        LivroUm.setAno(2023);
        LivroUm.setEditora("One More Chapter");
            
        LivroDois.setTitulo("Tom Lake: A Novel");
        LivroDois.setAutor("Ann Patchett");
        LivroDois.setAno(2023);
        LivroDois.setEditora("HarperAudio");
            
        LivroTres.setTitulo("Things We Left Behind");
        LivroTres.setAutor("Lucy Score");
        LivroTres.setAno(2023);
        LivroTres.setEditora("That's What She Said Publishing");
        
        System.out.println(LivroUm.titulo + "\n" + LivroUm.autor + "\n" + LivroUm.ano + "\n" + LivroUm.editora + "\n");
        System.out.println(LivroDois.titulo + "\n" + LivroDois.autor + "\n" + LivroDois.ano + "\n" + LivroDois.editora + "\n");
        System.out.println(LivroTres.titulo + "\n" + LivroTres.autor + "\n" + LivroTres.ano + "\n" + LivroTres.editora + "\n");

    }
}
