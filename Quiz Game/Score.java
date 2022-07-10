// public class Score{

// public static float gettScore(){
//     Float score = 0.0f;

//     Questions questions = new Questions();
//     Answers answers = new Answers();

//     Scanner input = new Scanner(System.in);

//     for(int i=0; i<10; i++)
//         {
            
//             System.out.println(questions.question(i));

//             Instant startTime = Instant.now();
//             String response = input.nextLine();
//             Instant endTime = Instant.now();

//             System.out.println("Your answer " + response);
//             String correct = answers.answer(i);

//             Duration timeTaken = Duration.between(startTime, endTime);
//             System.out.println("Time taken: " + timeTaken.toSeconds() + " seconds");

//             if(response.equals(correct))
//                 {
//                     System.out.println("Correct!");
//                     score = score + 2 * (60 - timeTaken.toSeconds()) / 40;                        }
//             else
//                 {
//                     System.out.println("Incorrect!");
//                 }    
//         }
//     return score;

// }
// }