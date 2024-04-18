package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
* @author Nipuna Thathsara
 */
public class LoginFormTest {

    @Test
    public void testStudentIdentity() {
        String studentId = "s223131384";
        Assert.assertNotNull("Student ID is null", studentId);
        System.out.println("Student ID: " + studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Nipuna Samaraweera";
        Assert.assertNotNull("Student name is null", studentName);
        System.out.println("Student name: " + studentName);
    }

    @Test
    public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode() {
        LoginStatus status = LoginForm.login(null, null);
        Assert.assertTrue(status.isLoginSuccess() == false);
        System.out.println("[Empty username, empty password] >> " + status);
    }

    @Test
    public void testEmptyUsernameAndEmptyPasswordAndDontCareValCode() {
        LoginStatus status = LoginForm.login(null, null);
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Empty Username", status.getErrorMessage());
        System.out.println("[Empty username, empty password] >> " + status);
    }

    @Test
    public void testEmptyUsernameAndWrongPasswordAndDontCareValCode() {
        LoginStatus status = LoginForm.login(null, "xyz");
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Empty Username", status.getErrorMessage());
        System.out.println("[Empty username, wrong password] >> " + status);
    }

    @Test
    public void testEmptyUsernameAndCorrectPasswordAndDontCareValCode() {
        LoginStatus status = LoginForm.login(null, "Nip_pass");
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Empty Username", status.getErrorMessage());
        System.out.println("[Empty username, correct password] >> " + status);
    }

    @Test
    public void testWrongUsernameAndEmptyPasswordAndDontCareValCode() {
        LoginStatus status = LoginForm.login("abc", null);
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Credential mismatch", status.getErrorMessage());
        System.out.println("[Wrong username, empty password] >> " + status);
    }

    @Test
    public void testWrongUsernameAndWrongPasswordAndDontCareValCode() {
        LoginStatus status = LoginForm.login("abc", "xyz");
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Credential mismatch", status.getErrorMessage());
        System.out.println("[Wrong username, wrong password] >> " + status);
    }

    @Test
    public void testWrongUsernameAndCorrectPasswordAndDontCareValCode() {
        LoginStatus status = LoginForm.login("abc", "Nip_pass");
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Credential mismatch", status.getErrorMessage());
        System.out.println("[Wrong username, correct password] >> " + status);
    }

    @Test
    public void testCorrectUsernameAndEmptyPasswordAndDontCareValCode() {
        LoginStatus status = LoginForm.login("Nipuna", null);
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Empty Password", status.getErrorMessage());
        System.out.println("[Correct username, empty password] >> " + status);
    }

    @Test
    public void testCorrectUsernameAndWrongPasswordAndDontCareValCode() {
        LoginStatus status = LoginForm.login("Nipuna", "xyz");
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Credential mismatch", status.getErrorMessage());
        System.out.println("[Correct username, wrong password] >> " + status);
    }

    @Test
    public void testCorrectUsernameAndCorrectPasswordAndDontCareValCode() {
        LoginStatus status = LoginForm.login("Nipuna", "Nip_pass");
        Assert.assertTrue("Expected login to succeed", status.isLoginSuccess());
        Assert.assertEquals("Wrong validation code", "123456", status.getErrorMessage());
        System.out.println("[Correct username, correct password] >> " + status);
    }

    @Test
    public void testEmptyUsernameAndEmptyPasswordAndWrongValCode() {
        LoginStatus status = LoginForm.login(null, null);
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Empty Username", status.getErrorMessage());
        System.out.println("[Empty username, empty password] >> " + status);
    }

    @Test
    public void testEmptyUsernameAndWrongPasswordAndWrongValCode() {
        LoginStatus status = LoginForm.login(null, "xyz");
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Empty Username", status.getErrorMessage());
        System.out.println("[Empty username, wrong password] >> " + status);
    }

    @Test
    public void testEmptyUsernameAndCorrectPasswordAndWrongValCode() {
        LoginStatus status = LoginForm.login(null, "Nip_pass");
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Empty Username", status.getErrorMessage());
        System.out.println("[Empty username, correct password] >> " + status);
    }

    @Test
    public void testWrongUsernameAndEmptyPasswordAndWrongValCode() {
        LoginStatus status = LoginForm.login("abc", null);
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Credential mismatch", status.getErrorMessage());
        System.out.println("[Wrong username, empty password] >> " + status);
    }

    @Test
    public void testWrongUsernameAndWrongPasswordAndWrongValCode() {
        LoginStatus status = LoginForm.login("abc", "xyz");
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Credential mismatch", status.getErrorMessage());
        System.out.println("[Wrong username, wrong password] >> " + status);
    }

    @Test
    public void testWrongUsernameAndCorrectPasswordAndWrongValCode() {
        LoginStatus status = LoginForm.login("abc", "Nip_pass");
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Credential mismatch", status.getErrorMessage());
        System.out.println("[Wrong username, correct password] >> " + status);
    }

    @Test
    public void testCorrectUsernameAndEmptyPasswordAndWrongValCode() {
        LoginStatus status = LoginForm.login("Nipuna", null);
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Empty Password", status.getErrorMessage());
        System.out.println("[Correct username, empty password] >> " + status);
    }

    @Test
    public void testCorrectUsernameAndWrongPasswordAndWrongValCode() {
        LoginStatus status = LoginForm.login("Nipuna", "xyz");
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Credential mismatch", status.getErrorMessage());
        System.out.println("[Correct username, wrong password] >> " + status);
    }

    @Test
    public void testCorrectUsernameAndCorrectPasswordAndWrongValCode() {
        LoginStatus status = LoginForm.login("Nipuna", "Nip_pass");
        Assert.assertTrue("Expected login to succeed", status.isLoginSuccess());
        Assert.assertEquals("Wrong validation code", "123456", status.getErrorMessage());
        System.out.println("[Correct username, correct password] >> " + status);
    }

    @Test
    public void testEmptyUsernameAndEmptyPasswordAndCorrectValCode() {
        LoginStatus status = LoginForm.login(null, null);
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Empty Username", status.getErrorMessage());
        System.out.println("[Empty username, empty password] >> " + status);
    }

    @Test
    public void testEmptyUsernameAndWrongPasswordAndCorrectValCode() {
        LoginStatus status = LoginForm.login(null, "xyz");
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Empty Username", status.getErrorMessage());
        System.out.println("[Empty username, wrong password] >> " + status);
    }

    @Test
    public void testEmptyUsernameAndCorrectPasswordAndCorrectValCode() {
        LoginStatus status = LoginForm.login(null, "Nip_pass");
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Empty Username", status.getErrorMessage());
        System.out.println("[Empty username, correct password] >> " + status);
    }

    @Test
    public void testWrongUsernameAndEmptyPasswordAndCorrectValCode() {
        LoginStatus status = LoginForm.login("abc", null);
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Credential mismatch", status.getErrorMessage());
        System.out.println("[Wrong username, empty password] >> " + status);
    }

    @Test
    public void testWrongUsernameAndWrongPasswordAndCorrectValCode() {
        LoginStatus status = LoginForm.login("abc", "xyz");
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Credential mismatch", status.getErrorMessage());
        System.out.println("[Wrong username, wrong password] >> " + status);
    }

    @Test
    public void testWrongUsernameAndCorrectPasswordAndCorrectValCode() {
        LoginStatus status = LoginForm.login("abc", "Nip_pass");
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Credential mismatch", status.getErrorMessage());
        System.out.println("[Wrong username, correct password] >> " + status);
    }

    @Test
    public void testCorrectUsernameAndEmptyPasswordAndCorrectValCode() {
        LoginStatus status = LoginForm.login("Nipuna", null);
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Empty Password", status.getErrorMessage());
        System.out.println("[Correct username, empty password] >> " + status);
    }

    @Test
    public void testCorrectUsernameAndWrongPasswordAndCorrectValCode() {
        LoginStatus status = LoginForm.login("Nipuna", "xyz");
        Assert.assertFalse("Expected login to fail", status.isLoginSuccess());
        Assert.assertEquals("Wrong error message", "Credential mismatch", status.getErrorMessage());
        System.out.println("[Correct username, wrong password] >> " + status);
    }

    @Test
    public void testCorrectUsernameAndCorrectPasswordAndCorrectValCode() {
        LoginStatus status = LoginForm.login("Nipuna", "Upe_pass");
        Assert.assertTrue("Expected login to succeed", status.isLoginSuccess());
        Assert.assertEquals("Wrong validation code", "123456", status.getErrorMessage());
        System.out.println("[Correct username, correct password] >> " + status);
    }
}
