package animal;

import java.util.Arrays;

public class Dog extends Pet implements Trained {

    public enum TrainedCommand { CMD_SIT,CMD_LIE_DOWN,CMD_VOICE,CMD_FETCH }

    private TrainedCommand[] trainedCommands = new TrainedCommand[0];

    public Dog(String name) {
        this(name, 0);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Насыпают собачий корм в миску");
        System.out.println("дают команду");
        System.out.println("Ем корм и пью воду");
    }

    @Override
    public String[] getTrainedCommands() {
        String[] commands = new String[trainedCommands.length];
        for (int i = 0; i < trainedCommands.length; i++) {
            commands[i] = trainedCommands[i].name();
        }
        return commands;
    }

    @Override
    public String[] getAllCommand() {
        String[] commands = new String[TrainedCommand.values().length];
        for (int i = 0; i < commands.length; i++) {
            commands[i] = TrainedCommand.values()[i].name();
        }
        return commands;

        }

    @Override
    public void train(String command) {
        TrainedCommand trainedCommand = TrainedCommand.valueOf(command);
        trainedCommands = Arrays.copyOf(trainedCommands, trainedCommands.length + 1);
        trainedCommands[trainedCommands.length - 1] = trainedCommand;
    }

    @Override
    public void doCommand(String command) {
        System.out.println("Выполняю команду " + command);
        TrainedCommand trainedCommand = TrainedCommand.valueOf(command);

        switch (trainedCommand) {
            case CMD_SIT:
                System.out.println("Собака садиться на пол");
                break;
            case CMD_FETCH:
                System.out.println("Собака побежала за палкой");
                System.out.println("Собака принесла палку");
                break;
            case  CMD_VOICE:
                talk();
                break;
            case  CMD_LIE_DOWN:
                talk();
                break;
            default:
                System.out.println("Нет такой команды");
        }
    }

}
