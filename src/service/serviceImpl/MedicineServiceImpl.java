package service.serviceImpl;

import model.Medicine;
import service.MedicineService;

import java.util.List;

public class MedicineServiceImpl implements MedicineService {
    @Override
    public String addMedicineToPharmacy(Long pharmacyId, Medicine medicine) {
        return null;
    }

    @Override
    public List<Medicine> getAllMedicineByPharmacyId(Long pharmacyId) {
        return null;
    }

    @Override
    public Medicine getByIdMedicine(Long pharmacyId, Long medicineId) {
        return null;
    }

    @Override
    public String updateMedicineById(Long pharmacyId, Long medicineId, Medicine newMedicine) {
        return null;
    }

    @Override
    public String deleteMedicineById(Long pharmacyId, Long medicineId) {
        return null;
    }

    @Override
    public List<Medicine> sortByPrice(String ascOrDesc) {
        return null;
    }

    @Override
    public List<Medicine> sortByDeliveryDate(String ascOrDesc) {
        return null;
    }

    @Override
    public List<Medicine> sortByExpirationDate(String ascOrDesc) {
        return null;
    }
}
