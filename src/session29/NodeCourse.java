package session29;

public class NodeCourse {
    
    private Course content;
    private NodeCourse nextNode;

    public NodeCourse(Course content, NodeCourse nextNode) {
        this.content = content;
        this.nextNode = nextNode;
    }

    public void setContent(Course content) {
        this.content = content;
    }

    public void setNextNode(NodeCourse nextNode) {
        this.nextNode = nextNode;
    }

    public Course getContent() {
        return content;
    }

    public NodeCourse getNextNode() {
        return nextNode;
    }
    
    
    
    
    
    
}
