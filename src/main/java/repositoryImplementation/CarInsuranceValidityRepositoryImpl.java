package repositoryImplementation;

import entity.CarInsuranceValidity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import repository.CarInsuranceValidityRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class CarInsuranceValidityRepositoryImpl implements CarInsuranceValidityRepository {
    @Override
    public CarInsuranceValidity findByCarPlate(String carPlate) {
        return null;
    }

    @Override
    public List<CarInsuranceValidity> findAll() {
        return null;
    }

    @Override
    public List<CarInsuranceValidity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<CarInsuranceValidity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<CarInsuranceValidity> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(CarInsuranceValidity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends CarInsuranceValidity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends CarInsuranceValidity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends CarInsuranceValidity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<CarInsuranceValidity> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends CarInsuranceValidity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends CarInsuranceValidity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<CarInsuranceValidity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public CarInsuranceValidity getOne(String s) {
        return null;
    }

    @Override
    public CarInsuranceValidity getById(String s) {
        return null;
    }

    @Override
    public <S extends CarInsuranceValidity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends CarInsuranceValidity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends CarInsuranceValidity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends CarInsuranceValidity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends CarInsuranceValidity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends CarInsuranceValidity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends CarInsuranceValidity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
