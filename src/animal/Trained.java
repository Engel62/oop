package animal;

public interface Trained {

    String[] getTrainedCommands();

    String[] getAllCommand();

    void doCommand(String command);

    void  train (String command);


}
