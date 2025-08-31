package com.practicejava;

public class Editor {

    private String content;

    public EditorState createState(){
        return new EditorState(content);
    }

    public void restore(EditorState state){
        content = state.getContent();
    }

    public void EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
