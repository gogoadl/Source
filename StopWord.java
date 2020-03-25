import java.util.ArrayList;
import java.util.StringTokenizer;

public class StopWord {
    String mSentence;
    ArrayList<String> stopWords = new ArrayList<>();
    public StopWord(String sentence)
    {
        this.mSentence = sentence;

    }
    public void AddStopWord(String stopword)
    {
        stopWords.add(stopword);
    }
    public void NLP()
    {
        String[] stringToken = mSentence.split(" ");
        String processedString = "";
        for(int i = 0; i < stringToken.length; i++)
        {
            for(int j = 0; j <stopWords.size(); j++)
            {
                if(stringToken[i].equals(stopWords.get(j)))
                {
                    System.out.println(stopWords.get(j) +" 가 제거되었습니다.");
                    i++;
                }
            }
            processedString += " " + stringToken[i];
        }
        System.out.println("등록된 불 용어 : " + stopWords.toString());
        System.out.println("처리되기 전 문장 : " + mSentence);
        System.out.println("처리 된 후 문장 : " + processedString);
    }




    public static void main(String[] args) {
        StopWord stopWord = new StopWord("The door is on your right");
        stopWord.AddStopWord("is");
        stopWord.AddStopWord("my");
        stopWord.NLP();

    }
}
