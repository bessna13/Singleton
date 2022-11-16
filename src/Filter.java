import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {

        Logger logger = Logger.getInstance();
        logger.log("Запуск процедуры фильтрации массива");

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) > treshold) {
                logger.log("Значение " + source.get(i) + " выше порогового " + treshold);
            } else {
                logger.log("Значение " + source.get(i) + " прошло фильтр порога");
                result.add(source.get(i));
            }

        }
        return result;
    }
}