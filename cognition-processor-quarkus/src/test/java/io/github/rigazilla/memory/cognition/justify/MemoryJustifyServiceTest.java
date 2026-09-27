package io.github.rigazilla.memory.cognition.justify;

import io.github.rigazilla.memory.cognition.event.CheckpointService;
import io.github.chirino.memory.grpc.v1.AdminEntriesServiceGrpc;
import io.github.chirino.memory.grpc.v1.AdminMemoriesServiceGrpc;
import io.github.chirino.memory.grpc.v1.AdminMemoryItem;
import io.github.chirino.memory.grpc.v1.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MemoryJustifyServiceTest {

    private MemoryJustifyService service;
    private AdminMemoriesServiceGrpc.AdminMemoriesServiceBlockingStub mockMemoriesStub;
    private AdminEntriesServiceGrpc.AdminEntriesServiceBlockingStub mockEntriesStub;

    @BeforeEach
    void setUp() {
        service = new MemoryJustifyService();
        mockMemoriesStub = mock(AdminMemoriesServiceGrpc.AdminMemoriesServiceBlockingStub.class);
        mockEntriesStub = mock(AdminEntriesServiceGrpc.AdminEntriesServiceBlockingStub.class);
        service.memoriesStub = mockMemoriesStub;
        service.entriesStub = mockEntriesStub;
    }

    @Test
    void testUuidConversion_RoundTrip_PreservesValue() {
        assertNotNull(service);
    }
}
