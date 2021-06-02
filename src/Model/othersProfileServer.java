package Model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
/**
 * <h1>othersProfileServer</h1>
 <p>this class starts a new client Socket and is a connector between othersProfileController and MainServer</p>
 @author Ali Varaste Pour
 @version 1.0
 @since 6/2/2021
 @since 11/3/1400
 */
public class othersProfileServer {
    public static void FollowHandler(String whoIsFollowed , String whoIsFollowing) throws IOException {
        Socket followSocket = new Socket("127.0.0.1" , 9085);
        DataOutputStream followDataOutputStream = new DataOutputStream(followSocket.getOutputStream());
        DataInputStream followDataInputStream = new DataInputStream(followSocket.getInputStream());
        followDataOutputStream.writeUTF(whoIsFollowed);
        followDataOutputStream.flush();
        followDataOutputStream.writeUTF(whoIsFollowing);
        followDataOutputStream.flush();
        followSocket.close();
        followDataOutputStream.close();
        followDataInputStream.close();
    }
}
