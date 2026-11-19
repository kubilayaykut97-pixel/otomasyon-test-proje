using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;

[TestFixture]
public class QA_Gorev_Tests
{
    private IWebDriver driver;

    [SetUp]
    public void Setup()
    {
        driver = new ChromeDriver();
        driver.Manage().Window.Maximize();
    }

    [Test]
    public void QA405_LoginKontrolTesti()
    {
        // 1. Adım: Siteye git ve giriş yap
        driver.Navigate().GoToUrl("https://www.saucedemo.com");
        driver.FindElement(By.Id("user-name")).SendKeys("standard_user");
        driver.FindElement(By.Id("password")).SendKeys("secret_sauce");
        driver.FindElement(By.Id("login-button")).Click();

        // 2. Adım: Başarılı giriş sonrası URL kontrolü (Kasten hatalı beklenti)
        string gelenUrl = driver.Url;

        // Testi bilerek patlatıyoruz: Doğru sayfa yerine yanlış bir sayfa bekliyoruz ki bug yakalayalım
        Assert.AreEqual("https://www.saucedemo.com/yanlis-sayfa.html", gelenUrl, "[BUG] Sayfa yönlendirmesi hatalı! Beklenen sayfa açılamadı.");
    }

    [TearDown]
    public void TearDown()
    {
        driver.Quit();
    }
}