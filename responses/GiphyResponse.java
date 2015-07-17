package responses;

import java.util.ArrayList;
import responses.Gif;
import java.util.Random;
import java.util.*;
public class GiphyResponse{
	private ArrayList<Gif> data;





	public ArrayList<Gif> getData(){
		Collections.shuffle(data);
		return data;
	}
}