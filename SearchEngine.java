import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class StringHandler implements URLHandler {
    ArrayList<String> strList = new ArrayList<String>();
    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return "Your Strings: " + strList;
        }
        else {
            if (url.getPath().equals("/add")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    strList.add(parameters[1]);
                    return "You added " + parameters[1] + " to your list of strings! It's now " + strList;
                }
            }
            else if (url.getPath().equals("/search")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    String matches = new String("");
                    for (int i = 0; i < strList.size(); ++i) {
                        if (strList.get(i).contains(parameters[1])) {
                            if (matches.equals("")) {
                                matches = strList.get(i);
                            }
                            else {
                                matches += " and " + strList.get(i);
                            }
                        }
                    }
                    return matches;
                }
            }
            return "404 Not Found!";
        }
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Missing port number! Try any number between 1024 to 49151.");
            return;
        }

        int port = Integer.parseInt(args[0]);
        Server.start(port, new StringHandler());
    } 
}