package search;

import java.util.List;

public interface ISearchValue {
	String setTranslite();
	String setSearechedValue();

	List<String> getSimilar(String current);
	float getSimilarity(String current, String checked);
}
