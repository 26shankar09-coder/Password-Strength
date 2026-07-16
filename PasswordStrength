
public class PasswordStrength {

    public static int checkStrength(String password) {

        int score = 0;

        if(password.length() >= 8)
            score += 20;

        if(password.matches(".*[A-Z].*"))
            score += 20;

        if(password.matches(".*[a-z].*"))
            score += 20;

        if(password.matches(".*\\d.*"))
            score += 20;

        if(password.matches(".*[!@#$%^&*()].*"))
            score += 20;

        return score;
    }

    public static String getStrength(int score){

        if(score == 100)
            return "Very Strong";

        else if(score >= 80)
            return "Strong";

        else if(score >= 60)
            return "Medium";

        else if(score >= 40)
            return "Weak";

        else
            return "Very Weak";
    }
}
