package co.edu.uco.pch.crosscutting.helpers;

import java.util.UUID;

public final class UUIDHelper {
	
	private UUIDHelper() {
		super();
	}
	
	public static final boolean isNull(final UUID uuid) {
		return uuid == null;
	}
	
	public static final boolean isNullOrEmpty(final UUID uuid) {
		return isNull(uuid);
	}
	
	public static final UUID getDefaultValue(final UUID uuid, final UUID defaultValue) {
		return isNullOrEmpty(uuid)? defaultValue : uuid;			
	}
	
	public static final UUID getDefaultValue(final UUID uuid) {
		return getDefaultValue(uuid, UUID.fromString("00000000-0000-0000-0000-000000000000"));		
	}
	
	public static final UUID applyDefault(final UUID uuid) {
		return getDefaultValue(uuid);
	}
}

