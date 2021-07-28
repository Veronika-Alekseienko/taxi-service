package taxi.controller.data.inject;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import taxi.lib.Injector;
import taxi.model.Car;
import taxi.model.Driver;
import taxi.model.Manufacturer;
import taxi.service.CarService;
import taxi.service.DriverService;
import taxi.service.ManufacturerService;

@WebServlet(urlPatterns = "/data/inject")
public class DataInjectController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("taxi");
    private final CarService carService =
            (CarService) injector.getInstance(CarService.class);
    private final ManufacturerService manufacturerService =
            (ManufacturerService) injector.getInstance(ManufacturerService.class);
    private final DriverService driverService =
            (DriverService) injector.getInstance(DriverService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Manufacturer manufacturer = new Manufacturer("BWM", "Germany");
        Manufacturer manufacturer1 = new Manufacturer("Lexus", "Germany");

        manufacturerService.create(manufacturer1);
        manufacturerService.create(manufacturer);

        Car car = new Car("X1", manufacturer);
        Car car1 = new Car("X5", manufacturer1);

        carService.create(car);
        carService.create(car1);

        Driver bob = new Driver("Bob", "1234", "bobLogin", "1212");
        Driver alice = new Driver("Alice", "2345", "aliceLogin", "2121");

        driverService.create(bob);
        driverService.create(alice);
    }
}
