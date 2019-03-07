package eventDb;

import com.sun.javafx.event.EventUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

    public static void main(String... args) throws SQLException {

        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("select");
            resultSet = preparedStatement.executeQuery();
            resultSet.next();

            PreparedStatement stmt = null;

            resultSet.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            //closeStatement(resultSet);
        }

    }

    private static void closeStatement(ResultSet resultSet) throws SQLException {
        //resultSet.close();
    }

}
