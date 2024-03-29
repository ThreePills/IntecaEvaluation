# Inteca Evaluation Task

Aplikacja składa się z 3 projektów Spring Boot:
  - SpringBoot Credit
  - SpringBoot Customer
  - SpringBoot Product

Baza danych oparta jest na PostgreSQL

# Uruchomienie
Aplikacja działa lokalnie (nie udało się stworzyć kontenerów Docker przez brak doświadczenia, pomimo prób)

Po uruchomieniu komponenty aplikacji działają na poniższych adresach:
- http://localhost:8080/restapi/credit/ - Dostępne funcjonalności związane z kredytami
    - http://localhost:8080/restapi/credit/getCredits - Zwracana jest lista Kredytów powiązana z danym klientem oraz produktem
    - http://localhost:8080/restapi/credit/createCredits - Funkcjonalność dotycząca utworzenia nowego kredytu. Wykorzystując Postman z metodą POST należy podać dane dotyczące kredytu przykładowo w formacie JSON w następujący sposób:
    {
	"firstName": "Jan",
    "surname": "Kowalski",
    "pesel": "91050103861",
    "productName": "Produkt 1",
    "creditName": "Mini Ratka",
    "value": 65321
    }
- http://localhost:8090/restapi/product/ - Funkcjonalności związane z produktami
    - http://localhost:8090/restapi/product/createProduct - Funkcjonalność dotycząca tworzenia nowego produktu
    - http://localhost:8090/restapi/product/getProducts - Funkcjonalność zwracająca wszystkie produkty znajdujące się w bazie danych
    - http://localhost:8090/restapi/product/getProduct/{creditId} - Funkcjonalność zwraca produkt o podanym identyfikatorze
- http://localhost:8070/restapi/customer/ - Funkcjonalności związane z klientami 
    - http://localhost:8070/restapi/customer/createCustomer - Funkcjonalność dotycząca tworzenia nowego klienta
    - http://localhost:8070/restapi/customer/getCustomers - Funkcjonalność zwracająca wszystkich klientów znajdujących się w bazie danych
    - http://localhost:8070/restapi/customer/getCustomer/{creditId} - Funkcjonalność zwraca klienta o podanym identyfikatorze