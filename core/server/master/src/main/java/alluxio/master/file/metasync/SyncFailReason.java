package alluxio.master.file.metasync;

public enum SyncFailReason {
  UNKNOWN,
  UNSUPPORTED,
  UFS_IO_FAILURE,
  CONCURRENT_UPDATE_DURING_SYNC,
  FILE_DOES_NOT_EXIST,
}
