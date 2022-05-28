package repositoryImplementation;

import entity.VehicleInformation;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import repository.VehicleInformationRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class VehicleInformationRepositoryImpl implements VehicleInformationRepository {
    @Override
    public VehicleInformation findByCarPlate() {
        return null;
    }

    @Override
    public List<VehicleInformation> findAll() {
        return null;
    }

    @Override
    public List<VehicleInformation> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<VehicleInformation> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<VehicleInformation> findAllById(Iterable<String> strings) {
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
    public void delete(VehicleInformation entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends VehicleInformation> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends VehicleInformation> S save(S entity) {
        return null;
    }

    @Override
    public <S extends VehicleInformation> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<VehicleInformation> findById(String s) {
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
    public <S extends VehicleInformation> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends VehicleInformation> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<VehicleInformation> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public VehicleInformation getOne(String s) {
        return null;
    }

    @Override
    public VehicleInformation getById(String s) {
        return null;
    }

    @Override
    public <S extends VehicleInformation> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends VehicleInformation> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends VehicleInformation> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends VehicleInformation> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends VehicleInformation> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends VehicleInformation> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends VehicleInformation, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
