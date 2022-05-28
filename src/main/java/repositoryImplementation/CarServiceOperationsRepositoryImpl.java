package repositoryImplementation;

import entity.CarServiceOperations;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import repository.CarServiceOperationsRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class CarServiceOperationsRepositoryImpl implements CarServiceOperationsRepository {
    @Override
    public CarServiceOperations findByCarPlate() {
        return null;
    }

    @Override
    public List<CarServiceOperations> findAll() {
        return null;
    }

    @Override
    public List<CarServiceOperations> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<CarServiceOperations> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<CarServiceOperations> findAllById(Iterable<String> strings) {
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
    public void delete(CarServiceOperations entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends CarServiceOperations> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends CarServiceOperations> S save(S entity) {
        return null;
    }

    @Override
    public <S extends CarServiceOperations> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<CarServiceOperations> findById(String s) {
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
    public <S extends CarServiceOperations> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends CarServiceOperations> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<CarServiceOperations> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public CarServiceOperations getOne(String s) {
        return null;
    }

    @Override
    public CarServiceOperations getById(String s) {
        return null;
    }

    @Override
    public <S extends CarServiceOperations> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends CarServiceOperations> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends CarServiceOperations> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends CarServiceOperations> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends CarServiceOperations> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends CarServiceOperations> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends CarServiceOperations, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
