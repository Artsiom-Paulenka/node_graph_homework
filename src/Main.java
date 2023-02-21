import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        NodeGraph A = new NodeGraph(null, "A");
        NodeGraph Б = new NodeGraph(null, "Б");
        NodeGraph В = new NodeGraph(null, "В");
        NodeGraph Г = new NodeGraph(null, "Г");
        NodeGraph Д = new NodeGraph(null, "Д");
        NodeGraph Е = new NodeGraph(null, "Е");
        NodeGraph Ж = new NodeGraph(null, "Ж");
        NodeGraph З = new NodeGraph(null, "З");
        NodeGraph И = new NodeGraph(null, "И");
        NodeGraph К = new NodeGraph(null, "К");

        List<NodeGraph> linksFromA = new ArrayList<>();
        linksFromA.add(Б);
        linksFromA.add(В);
        linksFromA.add(Г);
        linksFromA.add(Д);
        A.setLinks(linksFromA);

        List<NodeGraph> linksFromБ = new ArrayList<>();
        linksFromA.add(Е);
        Б.setLinks(linksFromБ);

        List<NodeGraph> linksFromВ = new ArrayList<>();
        linksFromВ.add(Ж);
        В.setLinks(linksFromВ);

        List<NodeGraph> linksFromГ = new ArrayList<>();
        linksFromГ.add(В);
        linksFromГ.add(З);
        Г.setLinks(linksFromГ);

        List<NodeGraph> linksFromД = new ArrayList<>();
        linksFromД.add(И);
        Д.setLinks(linksFromД);

        List<NodeGraph> linksFromЕ = new ArrayList<>();
        linksFromЕ.add(К);
        Е.setLinks(linksFromЕ);

        List<NodeGraph> linksFromЖ = new ArrayList<>();
        linksFromЖ.add(К);
        linksFromЖ.add(З);
        Ж.setLinks(linksFromЖ);

        List<NodeGraph> linksFromЗ = new ArrayList<>();
        linksFromЗ.add(К);
        З.setLinks(linksFromЗ);

        List<NodeGraph> linksFromИ = new ArrayList<>();
        linksFromИ.add(К);
        И.setLinks(linksFromИ);

        List<NodeGraph> linksFromК = new ArrayList<>();
        linksFromК.add(К);
        К.setLinks(linksFromК);

    }


}
