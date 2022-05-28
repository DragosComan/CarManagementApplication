package repositoryImplementation;

import entity.CarCascoValidity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import repository.CarCascoValidityRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class CarCascoValidityRepositoryImpl implements CarCascoValidityRepository {
    @Override
    public CarCascoValidity findByCarPlate(String carPlate) {
        return null;
    }

    @Override
    public List<CarCascoValidity> findAll() {
        return null;
    }

    @Override
    public List<CarCascoValidity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<CarCascoValidity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<CarCascoValidity> findAllById(Iterable<String> strings) {
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
    public void delete(CarCascoValidity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends CarCascoValidity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends CarCascoValidity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends CarCascoValidity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<CarCascoValidity> findById(String s) {
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
    public <S extends CarCascoValidity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends CarCascoValidity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<CarCascoValidity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public CarCascoValidity getOne(String s) {
        return null;
    }

    @Override
    public CarCascoValidity getById(String s) {
        return null;
    }

    @Override
    public <S extends CarCascoValidity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends CarCascoValidity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends CarCascoValidity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends CarCascoValidity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends CarCascoValidity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends CarCascoValidity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends CarCascoValidity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
