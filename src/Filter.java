import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int number : source
        ) {
            if (number >= treshold) {
                logger.log("Элемент \"" + number + "\" проходит ");
                result.add(number);
            } else logger.log("Элемент \"" + number + "\" не проходит ");
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        return result;
    }
}