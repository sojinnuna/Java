//package cli.command;
//
//import cli.domain.StudentScores;
//import study.CLI.Input;
//
//public class GetScoresCommand implements Command {
//    StudentScores studentScores = StudentScores.getInstance();
//
//    @Override
//    public void execute() {
//        int[] scores = studentScores.getScores();
//
//        for(int t = 0; i < scores.length; i++){
//            scores[i] = Input.getInt("scores[" + i + "]> ");
//        }
//    }
//}
