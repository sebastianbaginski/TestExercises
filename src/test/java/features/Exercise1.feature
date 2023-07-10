Feature: Poprawne logowanie do aplikacji i dodanie nowego adresu do książki adresowej
  Scenario Outline: Logowanie do aplikacji z użyciem poprawnych danych i dodanie nowego adresu
    Given Użytkownik otwiera przeglądarkę oraz przechodzi do aplikacji MyStore
    And Użytkownik przechodzi do strony logowania
    And Użytkownik wpisuje poprawny adres email i haslo oraz zatwierdza logowanie
    When Użytkownik przechodzi do strony z adresami, klikając w kafelek Addresses
    Then Użytkownik dodaje nowy adres, podając nazwę "<alias>", ulicę "<address>", miasto "<city>", kod pocztowy "<zip>", numer telefonu "<phone>"
    And Użytkownik sprawdza czy dane w dodanym adresie są poprawne
    And Przeglądarka zostaje zamknięta
  Examples:
    |alias|address|city|zip|phone|
    |domowy|Pogodna 1|Testowo|67-890|123456789|
