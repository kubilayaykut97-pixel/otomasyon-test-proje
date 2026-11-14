[Test]
public void  Şifre Sıfırlama(Forgot password) Akışı Testi()
{
    // 1. Kayıt sayfasına git
    driver.Navigate().GoToUrl("https://ornek.com/sifre_sifirla");



    // 4. Şifre alanına şifreni yaz
    driver.FindElement(By.Id("txtForgotEmail")).Click();

    // 5. Kayıt ol butonuna tıkla
    driver.FindElement(By.Id("btnReset")).Click();

    // 6. Başarılı kayıt olunduğunu doğrula
    Assert.That(driver.Title, Does.Contain("E-posta Gönderildi"));
}