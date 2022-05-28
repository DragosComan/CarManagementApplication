package repositoryImplementation;

import entity.CarTechnicalInspection;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import repository.CarTechnicalInspectionRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class CarTechnicalInspectionRepositoryImpl implements CarTechnicalInspectionRepository {
    @Override
    public CarTechnicalInspection findByCarPlate() {
        return null;
    }

    @Override
    public List<CarTechnicalInspectionRepository> findAll() {
        return null;
    }

    @Override
    public List<CarTechnicalInspectionRepository> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<CarTechnicalInspectionRepository> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<CarTechnicalInspectionRepository> findAllById(Iterable<String> strings) {
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
    public void delete(CarTechnicalInspectionRepository entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends CarTechnicalInspectionRepository> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends CarTechnicalInspectionRepository> S save(S entity) {
        return null;
    }

    @Override
    public <S extends CarTechnicalInspectionRepository> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<CarTechnicalInspectionRepository> findById(String s) {
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
    public <S extends CarTechnicalInspectionRepository> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends CarTechnicalInspectionRepository> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<CarTechnicalInspectionRepository> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public CarTechnicalInspectionRepository getOne(String s) {
        return null;
    }

    @Override
    public CarTechnicalInspectionRepository getById(String s) {
        return null;
    }

    @Override
    public <S extends CarTechnicalInspectionRepository> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends CarTechnicalInspectionRepository> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends CarTechnicalInspectionRepository> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends CarTechnicalInspectionRepository> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends CarTechnicalInspectionRepository> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends CarTechnicalInspectionRepository> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends CarTechnicalInspectionRepository, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
